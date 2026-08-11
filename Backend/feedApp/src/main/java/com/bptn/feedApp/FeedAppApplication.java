package com.bptn.feedApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class FeedAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedAppApplication.class, args);
	}

}


// API Endpoint (localhost:8080/user/register, localhost:8080/feed, localhost:8080/dashboard)
// View - React will render JSON
// Controller - UserController, FeedController, DashboardController
// Service - UserService (CRUD Operation), FeedService, DashboardService
// Model - User (DAO)
// Repository / Factory
// Comment