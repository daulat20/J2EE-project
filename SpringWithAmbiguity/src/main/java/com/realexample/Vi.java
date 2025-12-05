package com.realexample;

import org.springframework.stereotype.Component;

@Component("v")
public class Vi implements Sim{

	@Override
	public String calling() {
		return "Calling for Vi Sim Card";
	}

}
