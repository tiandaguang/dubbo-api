package com.alibaba.notice.impl;

import com.alibaba.notice.IDemoService;
import com.alibaba.notice.Person;

public class IDemoServiceImpl implements IDemoService {
	public Person get(int id) {
		return new Person(id, "Tianda", "4");
	}
}