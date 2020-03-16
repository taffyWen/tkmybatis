package com.linshenlu.tk.service.impl;

import com.linshenlu.tk.base.BaseTkMapper;
import com.linshenlu.tk.dao.UserTkMapper;
import com.linshenlu.tk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.linshenlu.tk.base.BaseServiceImpl;
import com.linshenlu.tk.entity.UserModel;

import java.util.List;

/**
 * @author wen
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserModel> implements UserService {

    @Autowired
    private UserTkMapper userMapper;

    /*@Override
    public BaseTkMapper<UserModel> getMapper() {
        return userMapper;
    }*/

}
