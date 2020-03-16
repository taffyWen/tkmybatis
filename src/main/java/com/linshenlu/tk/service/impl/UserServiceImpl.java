package com.linshenlu.tk.service.impl;

import com.linshenlu.tk.dao.UserTkMaper;
import com.linshenlu.tk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.linshenlu.tk.base.BaseServiceImpl;
import com.linshenlu.tk.entity.UserModel;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserModel> implements UserService {

    @Autowired
    private UserTkMaper userMapper;

    @Override
    public List<UserModel> selectAll() {
        return userMapper.selectAll();
    }


    @Override
    public UserModel selectOne(UserModel userModel) {
        return userMapper.selectOne(userModel);
    }


    @Override
    public List<UserModel> selectByExample(Object o) {
        return userMapper.selectByExample(o);
    }


}
