package com.zxt.service;

import com.zxt.pojo.Airplane;

import java.util.List;

public interface AirplaneService {
    List<Airplane> show(int takeid, int landid);
}
