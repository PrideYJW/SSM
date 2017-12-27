package com.service;

import com.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/16.
 */

public interface UserService {

    public List<UserEntity> query4List(Map<String, String> map);


    public int init();


    public int updata();
}
