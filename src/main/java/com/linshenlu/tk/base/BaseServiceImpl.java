package com.linshenlu.tk.base;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author wen
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    /**
     * 获取所需要的mapper
     * @return
     */
    @Autowired
    public  BaseTkMapper<T> baseTkMapper;


    @Override
    public int deleteByPrimaryKey(Object key) {
        return baseTkMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int delete(T record) {
        return baseTkMapper.delete(record);
    }

    @Override
    public int insert(T record) {
        return baseTkMapper.insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return baseTkMapper.insertSelective(record);
    }

    @Override
    public boolean existsWithPrimaryKey(Object key) {
        return baseTkMapper.existsWithPrimaryKey(key);
    }

    @Override
    public List<T> selectAll() {
        return baseTkMapper.selectAll();
    }

    @Override
    public T selectByPrimaryKey(Object key) {
        return baseTkMapper.selectByPrimaryKey(key);
    }

    @Override
    public int selectCount(T record) {
        return baseTkMapper.selectCount(record);
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
