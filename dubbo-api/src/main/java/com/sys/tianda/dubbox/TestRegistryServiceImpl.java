package com.sys.tianda.dubbox;

import org.springframework.stereotype.Service;

import com.sys.cache.TestRegistryService;

@Service("testRegistryServiceImpl")
public class TestRegistryServiceImpl implements TestRegistryService {
	public String hello(String name) {
		return "hello" + name;
	}
}