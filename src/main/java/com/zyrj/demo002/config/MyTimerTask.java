package com.zyrj.demo002.config;

import com.zyrj.demo002.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.TimerTask;

@Service
public class MyTimerTask extends TimerTask{

    private Integer cId;

    @Autowired
    private CommodityServiceImpl commodityService;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    @Override
    public void run() {
        System.out.println(cId);
        commodityService.deleteById(cId);
   }
}
