package com.linshenlu.tk.base;

import java.util.List;

public class  BaseServiceImpl<T> implements  BaseService<T> {

    @Override
    public int deleteByPrimaryKey(Object key) {
        return 0;
    }

    @Override
    public int delete(T record) {
        return 0;
    }

    @Override
    public int insert(T record) {
        return 0;
    }

    @Override
    public int insertSelective(T record) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object key) {
        return false;
    }

    @Override
    public List<T> selectAll() {
        return null;
    }

    @Override
    public T selectByPrimaryKey(Object key) {
        return null;
    }

    @Override
    public int selectCount(T record) {
        return 0;
    }

    @Override
    public List<T> select(T record) {
        return null;
    }

    @Override
    public T selectOne(T record) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return 0;
    }

    @Override
    public int deleteByCondition(Object condition) {
        return 0;
    }

    @Override
    public List<T> selectByCondition(Object condition) {
        return null;
    }

    @Override
    public int selectCountByCondition(Object condition) {
        return 0;
    }

    @Override
    public int updateByCondition(T record, Object condition) {
        return 0;
    }

    @Override
    public int updateByConditionSelective(T record, Object condition) {
        return 0;
    }

    @Override
    public int deleteByExample(Object example) {
        return 0;
    }

    @Override
    public List<T> selectByExample(Object example) {
        return null;
    }

    @Override
    public int selectCountByExample(Object example) {
        return 0;
    }

    @Override
    public T selectOneByExample(Object example) {
        return null;
    }

    @Override
    public int updateByExample(T record, Object example) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(T record, Object example) {
        return 0;
    }

    @Override
    public int deleteByIds(String ids) {
        return 0;
    }

    @Override
    public List<T> selectByIds(String ids) {
        return null;
    }

    @Override
    public int insertList(List<T> recordList) {
        return 0;
    }

    @Override
    public int insertUseGeneratedKeys(T record) {
        return 0;
    }
}
