package com.dao;

import com.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/16.
 */
@Repository
public interface UserDao {


    public List<UserEntity> query4List(Map<String, String> map);




}


















