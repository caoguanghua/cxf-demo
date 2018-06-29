package com.mes.cxf.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mes.cxf.bean.SpareParts;

public interface SparePartsDao {
	List<SpareParts> getList(@Param("page")Integer page,@Param("rows") int rows,@Param("spareParts") SpareParts spareParts);
	int getListCount(@Param("spareParts") SpareParts spareParts);
}
