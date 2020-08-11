package com.zxt.service.impl;

import com.zxt.pojo.Account;
import com.zxt.pojo.Log;
import com.zxt.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.logging.Logger;

public class AccountServiceImpl implements AccountService {
    @Override
    public int transfer(Account accIn, Account accOut) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        //判断账号密码匹配
        Account accOutSelect = session.selectOne("com.zxt.mapper.AccountMapper.selByAccnoPwd", accOut);
        if (accOutSelect != null) {
            if (accOutSelect.getBalance() >= accOut.getBalance()) {
                Account accInSelect = session.selectOne("com.zxt.mapper.AccountMapper.selByAccnoName", accIn);
                if (accInSelect != null) {
                    accIn.setBalance(accOut.getBalance());
                    accOut.setBalance(-accOut.getBalance());
                    int index = session.update("com.zxt.mapper.AccountMapper.updBalanceByAccno", accOut);
                    index += session.update("com.zxt.mapper.AccountMapper.updBalanceByAccno", accIn);
                    if (index == 2) {
                        //日志表记录
                        Log log = new Log();
                        log.setAccIn(accIn.getAccno());
                        log.setAccOut(accOut.getAccno());
                        log.setMoney(accIn.getBalance());
                        session.insert("com.zxt.mapper.LogMapper.insLog",log);
                        //日志文件记录
                        Logger logger = Logger.getLogger(String.valueOf(AccountServiceImpl.class));
                        logger.info(log.getAccOut()+"给"+log.getAccIn()+"在"+new Date().toLocaleString()+"转了"+log.getMoney());
                        session.commit();
                        session.close();
                        return SUCCESS;
                    } else {
                        session.rollback();
                        session.close();
                        return ERROR;
                    }
                } else {
                    //账户和姓名不匹配
                    return ACCOUNT_NAME_NOT_MATCH;
                }
            } else {
                //余额不足
                return ACCOUNT_BALANCE_NOT_ENOUGH;
            }
        } else {
            //账号和密码不匹配
            return ACCOUNT_PASSWORD_NOT_MATCH;
        }
    }
}
