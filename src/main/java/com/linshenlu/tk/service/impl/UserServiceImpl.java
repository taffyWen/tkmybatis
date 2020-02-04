package com.linshenlu.tk.service.impl;

import com.linshenlu.tk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.linshenlu.tk.base.BaseServiceImpl;
import com.linshenlu.tk.dao.UserMapper;
import com.linshenlu.tk.entity.UserModel;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserModel> implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    @Override
    public int delete(UserModel userModel) {
        return 0;
    }

    @Override
    public int insert(UserModel userModel) {
        return 0;
    }

    @Override
    public int insertSelective(UserModel userModel) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    @Override
    public List<UserModel> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public UserModel selectByPrimaryKey(Object o) {
        return null;
    }

    @Override
    public int selectCount(UserModel userModel) {
        return 0;
    }

    @Override
    public List<UserModel> select(UserModel userModel) {
        return null;
    }

    @Override
    public UserModel selectOne(UserModel userModel) {
        return userMapper.selectOne(userModel);
    }

    @Override
    public int updateByPrimaryKey(UserModel userModel) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserModel userModel) {
        return 0;
    }

    @Override
    public int deleteByCondition(Object o) {
        return 0;
    }

    @Override
    public List<UserModel> selectByCondition(Object o) {
        return null;
    }

    @Override
    public int selectCountByCondition(Object o) {
        return 0;
    }

    @Override
    public int updateByCondition(UserModel userModel, Object o) {
        return 0;
    }

    @Override
    public int updateByConditionSelective(UserModel userModel, Object o) {
        return 0;
    }

    @Override
    public int deleteByExample(Object o) {
        return 0;
    }

    @Override
    public List<UserModel> selectByExample(Object o) {
        return userMapper.selectByExample(o);
    }

    @Override
    public int selectCountByExample(Object o) {
        return 0;
    }

    @Override
    public UserModel selectOneByExample(Object o) {
        return null;
    }

    @Override
    public int updateByExample(UserModel userModel, Object o) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(UserModel userModel, Object o) {
        return 0;
    }

    @Override
    public int deleteByIds(String s) {
        return 0;
    }

    @Override
    public List<UserModel> selectByIds(String s) {
        return null;
    }

    @Override
    public int insertList(List<UserModel> list) {
        return 0;
    }

    @Override
    public int insertUseGeneratedKeys(UserModel userModel) {
        return 0;
    }
}
