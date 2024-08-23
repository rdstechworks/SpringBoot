package com.rdstechworks.spring.order.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order/")
public class OrderController {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@GetMapping("/send")
	public String orderService() {
		return "this is order service";
	}

	@GetMapping("/sendPay")
	public String sendPay() {
		
		String url = "http://PAYMTSERVICE/payment/send";
		return restTemplate.getForObject(url, String.class);
	}

}
