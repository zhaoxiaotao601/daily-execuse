package com.zxt.mapper;

import com.zxt.pojo.Airplane;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AirplaneMapper {
    List<Airplane> selByTakeidLandid(@Param("takeid") int takeid, @Param("landid") int landid);
}
