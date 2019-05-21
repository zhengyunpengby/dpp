package com.rainier;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: dpp
 * @description: 调度任务测试
 * @author: zyp
 * @create: 2019-05-21 13:45
 **/
@Component
@EnableScheduling
public class ScheduledTask {
    private static int count = 0;

    @Scheduled(cron = "0/5 * * * * ?")
    public void task() {
        System.out.println(Thread.currentThread().getName() + ":" + count++);
    }
}
