package spring.service.impl;


import spring.core.annotation.MyService;
import spring.service.IDemoService;

@MyService
public class DemoService implements IDemoService {

	@Override
	public String get(String name) {
		return "My name is " + name;
	}

}
