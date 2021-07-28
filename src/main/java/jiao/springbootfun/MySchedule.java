package jiao.springbootfun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedule {

    Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "0/10 * * * * ?")
    private void accessTokenSchedule0(){
        LOGGER.debug("--task start0");
        try {
            Thread.sleep(20 *1000);
        } catch (InterruptedException e) {
            LOGGER.error("", e);
        }
        LOGGER.debug("--task end0");

    }


    @Scheduled(cron = "0/10 * * * * ?")
    private void accessTokenSchedule1(){
        LOGGER.debug("task start1");

    }



}
