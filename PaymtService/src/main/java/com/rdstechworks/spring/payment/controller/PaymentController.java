package com.rdstechworks.spring.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment/")
public class PaymentController {
	
	@GetMapping("/send")
	public String orderService() {
		return "this is payment service";
	}

}
