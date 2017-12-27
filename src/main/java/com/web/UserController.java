package com.web;

import com.entity.UserEntity;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/16.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/queryForList.xhtml")
    @ResponseBody
    public List<UserEntity> queryForList(HttpServletRequest request){
        Map<String,String> map = new HashMap();

        return   userService.query4List(map);
    }





}
