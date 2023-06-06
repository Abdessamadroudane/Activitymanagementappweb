package com.example.Appweb;

import com.example.Appweb.serviceinitImpl.ActivityManagementInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@RestController
public class ActivityManagementApplication implements CommandLineRunner {
	private final ActivityManagementInitService activityManagementInitService;

	@Autowired
	public ActivityManagementApplication(ActivityManagementInitService activityManagementInitService) {
		this.activityManagementInitService = activityManagementInitService;
	}

	public static void main(String[] args) {
		SpringApplication.run(ActivityManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		activityManagementInitService.initUser();
		activityManagementInitService.initActivity();
		activityManagementInitService.initKpi();
		activityManagementInitService.initProject();
		activityManagementInitService.initRetex();
		activityManagementInitService.initKpiValue();
		activityManagementInitService.initTeam();
		activityManagementInitService.initRole();
		activityManagementInitService.initSubTeam();
		activityManagementInitService.initTask();
	}
}
