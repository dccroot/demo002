package com.zyrj.demo002.repository;

import com.zyrj.demo002.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>,JpaSpecificationExecutor<Address> {
}
