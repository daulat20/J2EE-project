package com.realexample;

import org.springframework.stereotype.Component;

@Component("j")		//id
public class Jio implements Sim{

	@Override
	public String calling() {
		return "Calling for Jio Sim Card";
	}
}
