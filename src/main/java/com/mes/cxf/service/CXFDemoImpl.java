package com.mes.cxf.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.mes.cxf.service.CXFDemo", serviceName = "cxfDemo")
public class CXFDemoImpl implements CXFDemo {

	@Override
	public String sayHello(String foo) {
		System.out.println("exec...");
		return "hello "+foo;
	}

}
