package com.netease.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/ribbon-consumer" , method = RequestMethod.GET)
	public String helloConsumer() {
		System.out.println("entered helloConsumer()");
		return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
	}
	
}
