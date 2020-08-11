package atmsystem;

public class AtmService {

    private AtmDao dao = new AtmDao();

    //登陆
    public String login(String aname, String apassword) {
        User user = dao.selectOne(aname);
        if (user != null && user.getApassword().equals(apassword)) {
            return "登录成功";
        }
        return "用户名或密码错误";
    }

    //查询余额
    public Float queryBalance(String aname) {
        User user = dao.selectOne(aname);
        return user.getAbalance();
    }

    //存款
    public void deposit(String aname, Float depositMoney) {
        //先将集合内的数据修改，找到某一个user对象，将对像中的balance属性修改
        User user = dao.selectOne(aname);
        user.setAbalance(user.getAbalance() + depositMoney);
        dao.update(user);
        //dao.commit();//将临时数据永久的写入文件
    }

    //设计一个方法，取款
    public void withdrawal(String aname, Float withdrawalMoney) {
        User user = dao.selectOne(aname);
        if (user.getAbalance() > withdrawalMoney) {
            user.setAbalance(user.getAbalance() - withdrawalMoney);
            dao.update(user);
            //dao.commit();//将临时数据永久写入文件
        } else {
            System.out.println("对不起" + aname + ",您的账户余额不足");
        }
    }

    //设计一个方法，转账
    public void transfer(String outName, String inName, Float transferMoney) {
        User outUser = dao.selectOne(outName);
        if (outUser.getAbalance() > transferMoney) {
            User inUser = dao.selectOne(inName);
            if (inUser != null) {//转入账户是存在的
                outUser.setAbalance(outUser.getAbalance() - transferMoney);
                inUser.setAbalance(inUser.getAbalance() + transferMoney);
                dao.update(outUser);
                dao.update(inUser);
                //this.commit();//将临时数据永久写入文件
            } else {
                System.out.println("对不起，您输入的转入账户不存在");
            }

        } else {
            System.out.println("对不起" + outName + ",您的账户余额不足");
        }
    }
}
