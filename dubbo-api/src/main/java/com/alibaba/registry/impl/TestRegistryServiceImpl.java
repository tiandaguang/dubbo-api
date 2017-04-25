package com.alibaba.registry.impl;

import com.alibaba.registry.TestRegistryService;

public class TestRegistryServiceImpl implements TestRegistryService {
	public String hello(String name) {
		return "hello" + name;
	}
}