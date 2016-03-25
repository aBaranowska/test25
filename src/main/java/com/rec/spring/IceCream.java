package com.rec.spring;

import org.springframework.stereotype.Component;

@Component
public class IceCream implements Dessert {

	public String getMessage() {
		return "iceCream";
	}

}
