package com.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration conf;
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitFromConfiguration() {
		return new LimitConfiguration(conf.getMinimum(),conf.getMaximum());
	}
}
