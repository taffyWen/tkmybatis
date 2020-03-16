package com.linshenlu.tk.controller;

import com.linshenlu.tk.entity.Dept;
import com.linshenlu.tk.entity.UserModel;
import com.linshenlu.tk.service.DeptService;
import com.linshenlu.tk.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author wen
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private DeptService deptService;


    private final static Logger logger = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/getAllDept")
    public List<Dept> getAllDept(){
        return deptService.selectAll();
    }
    @RequestMapping("/getAll")
    public List getAllUserInfo(){

        List<UserModel> userModels = userService.selectAll();
        logger.info("getAll{}" , userModels);
        return userModels;
    }

    @RequestMapping("/selectOne/{id}")
    public UserModel selectOne(@PathVariable int id){
        UserModel userModel = userService.selectByPrimaryKey(id);
        return userModel;
    }

    @RequestMapping("/selectByExample")
    public List selectByExample(){
        Example example = new Example(UserModel.class);
        //排序
        example.orderBy("salary").orderBy("age").asc();

        Example.Criteria criteria1 = example.createCriteria();
        Example.Criteria criteria2 = example.createCriteria();
        criteria1.andGreaterThan("salary",2000);
        criteria1.andLessThan("age",20);
        criteria2.andLessThan("salary",6000);
        criteria2.andGreaterThan("age",20);

        //不同条件关联
        example.or(criteria2);

        List<UserModel> userModels = userService.selectByExample(example);
        return userModels;
    }

}
