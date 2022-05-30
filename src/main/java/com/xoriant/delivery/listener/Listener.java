package com.xoriant.delivery.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

	@JmsListener(destination = "brandQ")
	public void getBrandInfo(String response) {
		System.out.println("========================");
		System.out.println(response);
		System.out.println("========================");
	}
}
