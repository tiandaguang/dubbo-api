package com.alibaba.validation.impl;

import org.springframework.stereotype.Service;

import com.alibaba.validation.ValidationParameter;
import com.alibaba.validation.ValidationService;

@Service("validationServiceImpl")
public class ValidationServiceImpl implements ValidationService {

	public void save(ValidationParameter parameter) {
		System.out.println("ValidationServiceImpl ----------->save");
	}

	public void update(ValidationParameter parameter) {
		System.out.println("ValidationServiceImpl ----------->update");
	}

	public void delete(ValidationParameter parameter) {
		System.out.println("ValidationServiceImpl ----------->delete");
	}

}