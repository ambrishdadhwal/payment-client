package com.paymentclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.paymentclient")
public class PaymentClientApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(PaymentClientApplication.class, args);
	}

}
