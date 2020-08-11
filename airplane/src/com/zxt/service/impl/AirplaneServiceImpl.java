package com.zxt.service.impl;

import com.zxt.mapper.AirplaneMapper;
import com.zxt.pojo.Airplane;
import com.zxt.service.AirplaneService;
import com.zxt.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirplaneServiceImpl implements AirplaneService {
    @Override
    public List<Airplane> show(int takeid, int landid) {
        return MyBatisUtil.getSession().getMapper(AirplaneMapper.class).selByTakeidLandid(takeid,landid);
    }
}
