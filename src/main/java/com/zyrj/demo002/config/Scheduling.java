package com.zyrj.demo002.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Configuration
public class Scheduling {

//    秒 分钟 小时 日期 月份 星期 年 　符号 , - * /
    @Scheduled(cron = "*/10 * * * * ?")
    public void nowData(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.err.println(simpleDateFormat.format(new Date()));
    }
}
