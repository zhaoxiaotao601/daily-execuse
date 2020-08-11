package com.zxt.service;

import com.zxt.pojo.Airport;

import java.util.List;

public interface AirportService {
    /**
     * 显示所有起飞机场
     * @return
     */
    List<Airport> showTakePort();
    /**
     * 显示所有降落机场
     * @return
     */
    List<Airport> showLandPort();
}
