package com.laptrinhjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.laptrinhjavaweb.repository.NewRepository;
import com.laptrinhjavaweb.service.INewService;

public class NewService implements INewService {
	
	@Autowired
	private NewRepository newRepository;
}
