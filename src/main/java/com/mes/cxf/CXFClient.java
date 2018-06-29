package com.mes.cxf;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.mes.cxf.bean.SpareParts;
import com.mes.cxf.service.CXFDemo;
import com.mes.cxf.service.CXFSparePartsService;

public class CXFClient {
	public static void main(String[] args) {
	JaxWsProxyFactoryBean proxy = new JaxWsProxyFactoryBean();
	proxy.setServiceClass(CXFDemo.class);
	proxy.setAddress("http://localhost:8080/services/cxfdemo");
       CXFDemo cxf = (CXFDemo) proxy.create();
       System.out.println(cxf.sayHello("haha"));
    JaxWsProxyFactoryBean proxy2 = new JaxWsProxyFactoryBean();
   	proxy2.setServiceClass(CXFSparePartsService.class);
   	proxy2.setAddress("http://localhost:8080/services/spareParts");
   	CXFSparePartsService cxf2 = (CXFSparePartsService) proxy2.create();
   	SpareParts spareParts=new SpareParts();
   	spareParts.setDescription("1111111111111111111111111111111111111111111111");
   	System.out.println(cxf2.sayHello(spareParts));   
	}
}
