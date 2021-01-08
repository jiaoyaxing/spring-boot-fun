package jiao.springbootfun;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedule {

    @Scheduled(cron = "0/5 * * * * ?")
    private void accessTokenSchedule(){
        System.out.println("task start");

    }
}
