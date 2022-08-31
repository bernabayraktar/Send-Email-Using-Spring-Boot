package com.berna.springEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {
	
	@Autowired
	private EmailSenderService senderService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
		
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendEmail("luv2code.chad34@gmail.com", "This is subject", "This is body of Email");
	}

}
