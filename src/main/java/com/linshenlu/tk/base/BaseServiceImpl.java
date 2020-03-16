package com.linshenlu.tk.base;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author wen
 */
public abstract class BaseServiceImpl<T,Id> implements  BaseService<T,Id> {


    /**
     * 获取所需要的mapper
     * @return
     */
    public abstract BaseTkMapper<T> getMapper();


    @Override
    public int save(T t) {
        return getMapper().insertSelective(t);
    }

    @Override
    public int delete(T t) {
        return getMapper().delete(t);
    }

    @Override
    public int deleteById(Id id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int update(T t) {
        return getMapper().updateByPrimaryKeySelective(t);
    }

    @Override
    public T getById(Id id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public List<T> getAll() {
        return getMapper().selectAll();
    }

    @Override
    public int saveAll(List<T> list) {
        return getMapper().insertList(list);
    }

    @Override
    public List<T> searchByExample(Example example) {
        return getMapper().selectByExample(example);
    }
}
