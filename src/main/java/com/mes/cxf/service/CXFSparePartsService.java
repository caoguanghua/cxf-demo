package com.mes.cxf.service;

import javax.jws.WebService;

import com.mes.cxf.bean.SpareParts;

@WebService
public interface CXFSparePartsService {
	public int sayHello(SpareParts spareParts);
}
