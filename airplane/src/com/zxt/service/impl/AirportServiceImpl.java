package com.zxt.service.impl;

import com.zxt.mapper.AirportMapper;
import com.zxt.pojo.Airport;
import com.zxt.service.AirportService;
import com.zxt.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AirportServiceImpl implements AirportService {
    @Override
    public List<Airport> showTakePort() {
        SqlSession session = MyBatisUtil.getSession();
        AirportMapper airportMapper = session.getMapper(AirportMapper.class);
        return airportMapper.selTakePort();
    }

    @Override
    public List<Airport> showLandPort() {
        SqlSession session = MyBatisUtil.getSession();
        AirportMapper airportMapper = session.getMapper(AirportMapper.class);
        return airportMapper.selLandPort();
    }
}
