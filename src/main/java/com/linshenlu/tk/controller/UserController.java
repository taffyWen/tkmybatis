package com.linshenlu.tk.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.linshenlu.tk.entity.UserModel;
import com.linshenlu.tk.service.impl.UserServiceImpl;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/getAll")
    public List getAllUserInfo(){

        List<UserModel> userModels = userService.selectAll();
        logger.info("getAll{}" , userModels);
        return userModels;
    }

    @RequestMapping("/selectOne")
    public UserModel selectOne(@RequestBody String str){
        UserModel userModel = JSON.parseObject(str,UserModel.class);
        UserModel userModel1 = userService.selectOne(userModel);
        return userModel1;
    }

    @RequestMapping("/selectByExample")
    public List selectByExample(){
        Example example = new Example(UserModel.class);
        Example.Criteria criteria1 = example.createCriteria();
        Example.Criteria criteria2 = example.createCriteria();
        criteria1.andGreaterThan("salary",2000);
        criteria1.andLessThan("age",20);
        criteria2.andLessThan("salary",6000);
        criteria2.andGreaterThan("age",20);
        example.or(criteria2);

        List<UserModel> userModels = userService.selectByExample(example);
        return userModels;
    }

}
