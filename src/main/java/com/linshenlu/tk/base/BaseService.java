package com.linshenlu.tk.base;


import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 之所以此处 extends BaseMapper，只能获取BaseMapper中已有的接口
 * 其实可以不继承 BaseMapper ， 只需要写几个常用的抽象方法即可
 * @param <T>
 */
public interface BaseService<T> extends BaseTkMapper<T>{

}
