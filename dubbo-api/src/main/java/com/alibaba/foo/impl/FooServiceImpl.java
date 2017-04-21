package com.alibaba.foo.impl;

import org.springframework.stereotype.Service;

import com.alibaba.foo.FooService;
          
@Service("fooServiceImpl")
public class FooServiceImpl implements FooService {

	@Override
	public String findFoo() {
		try {
			Thread.sleep(3000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "fooServiceImpl";
	}

}
