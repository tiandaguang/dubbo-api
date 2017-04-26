package com.alibaba.registry.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.registry.TestRegistryService;

public class TestRegistryServiceImpl implements TestRegistryService {
	public String hello(String name) {
		// 获取客户端隐式传入的参数，用于框架集成，不建议常规业务使用
		name = RpcContext.getContext().getAttachment("name");
		return "hello" + name;
	}
}