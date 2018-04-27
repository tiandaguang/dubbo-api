package com.alibaba.bar.impl;

import org.springframework.stereotype.Service;

import com.alibaba.bar.BarService;

@Service("barServiceImpl")
public class BarServiceImpl implements BarService {

	public String findBar() {

		try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return "booServiceImpl";
	}
}
