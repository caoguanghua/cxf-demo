package com.mes.cxf.service;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mes.cxf.bean.SpareParts;
import com.mes.cxf.dao.SparePartsDao;

@Component("CXFSparePartsService")
@WebService(endpointInterface = "com.mes.cxf.service.CXFSparePartsService", serviceName = "spareParts")
public class CXFSparePartsServiceImpl implements CXFSparePartsService {
	@Autowired
	private SparePartsDao sparePartsDao;
	@Override
	public int sayHello(SpareParts spareParts) {
		if(spareParts==null){
			System.out.println("spareParts==null---------------------------------");
		}else{
			System.out.println(spareParts.getDescription());
			System.out.println("3433333333333333333333333333333:"+sparePartsDao);
		}
		Integer result=sparePartsDao.getListCount(spareParts);
		return result;
	}
}
