package com.abhinav;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class SchedulerClass {
	
	@Scheduled(cron = "0 * * ? * *")		//this cron expression will execute every minute (freeformatter.com)
	public void schedulerMethod() {
				System.out.println("schedulerMethod is called");
	}
}
