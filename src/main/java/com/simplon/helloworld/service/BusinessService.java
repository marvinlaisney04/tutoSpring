package com.simplon.helloworld.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.simplon.helloworld.model.HelloWorld;

@Component
@Qualifier("Business")
public class BusinessService {
	public HelloWorld getHelloWorld() {
		return new HelloWorld();
	}
}
