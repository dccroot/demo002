package com.zyrj.demo002.repository;

import com.zyrj.demo002.entity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommodityRepository extends JpaRepository<Commodity,Integer> {

}
