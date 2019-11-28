package com.zyrj.demo002.service;

import com.zyrj.demo002.entity.Commodity;

import java.util.List;


public interface CommodityService {

    Commodity save(Commodity commodity);

    List<Commodity> findAll();

    Commodity findById(Integer id);

    void deleteById(Integer id);

    void saveAll(List list);
}
