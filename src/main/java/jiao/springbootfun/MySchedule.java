package jiao.springbootfun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedule {

    Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "0/5 * * * * ?")
    private void accessTokenSchedule(){
        LOGGER.debug("task start");

    }
}
