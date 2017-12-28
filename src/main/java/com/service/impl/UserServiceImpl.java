package com.service.impl;

import com.dao.UserDao;
import com.entity.UserEntity;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public List<UserEntity> query4List(Map<String, String> map) {

        return userDao.query4List(map);
    }




}
