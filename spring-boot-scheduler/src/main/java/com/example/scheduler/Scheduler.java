package com.example.scheduler;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
 
@Component
public class Scheduler {
 
//run every 2 seconds
    @Scheduled(fixedRate = 2000)
    public void run1() {
 
        System.out.println("Hello Fixed Rate -------------> Time now is : "
                + LocalTime.now().format(DateTimeFormatter.ofPattern("hh mm ss")));
 
    }
 
  //wait for 1 second between successive runs
    @Scheduled(fixedDelay = 1000)
    public void run2() {
 
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 
        System.out.println(
                "Hello Fixed Delay, Time now is : " + LocalTime.now().format(DateTimeFormatter.ofPattern("hh mm ss")));
    }
 
 
//run during the first second every minute every hour every day of month //every month every day of week
    @Scheduled(cron = "0 * * * * *")
    public void run3() {
 
        System.out.println("Hello Cron Job **********************> Time now is : "
                + LocalTime.now().format(DateTimeFormatter.ofPattern("hh mm ss")));
    }
}