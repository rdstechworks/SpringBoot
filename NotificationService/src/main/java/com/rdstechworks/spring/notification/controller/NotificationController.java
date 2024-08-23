package com.rdstechworks.spring.notification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

	@GetMapping("/send")
	public String notification() {
		return "Notification controller";
	}
}
