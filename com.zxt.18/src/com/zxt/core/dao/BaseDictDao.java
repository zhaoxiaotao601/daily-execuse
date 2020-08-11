package com.zxt.core.dao;
import java.util.List;
import com.zxt.core.po.BaseDict;
/**
 * 数据字典
 */
public interface BaseDictDao {
	// 根据类别代码查询数据字典
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
