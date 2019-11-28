package com.zyrj.demo002.service;

import com.zyrj.demo002.entity.Address;

import java.util.List;

public interface AddressService {

    void add(Address address);

    List<Address> findByUId(Integer uId);
}
