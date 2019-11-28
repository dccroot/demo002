package com.zyrj.demo002.service;


import com.zyrj.demo002.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface UserService {

   void saveAll(List list);

   List<User> findAll();

   List<User> findById(Integer id);

   List<User> likeByPhone(String phone);

   List<User> betweenById(Integer beginId,Integer endId);

   List<User> inById(Integer [] ids);

   List<User> findByUser(User user);

   Page<User> findAllAndPage(Integer page,Integer size);

   List<User> findAddressByPhone(String phone);

}
