package com.linshenlu.tk.base;


import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 之所以此处 extends BaseMapper，只能获取BaseMapper中已有的接口
 * 其实可以不继承 BaseMapper ， 只需要写几个常用的抽象方法即可
 * @param <T>
 */
public interface BaseService<T,Id> {
    int save(T t);

    int delete(T t);

    int deleteById(Id id);

    int update(T t);

    T getById(Id id);

    List<T> getAll();

    int saveAll(List<T> list);

    List<T> searchByExample(Example example);
}
