package com.linshenlu.tk.base;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author wen
 */
public interface BaseTkMapper<T> extends tk.mybatis.mapper.common.BaseMapper<T>, MySqlMapper<T>, IdsMapper<T>, ConditionMapper<T>, ExampleMapper<T> {
}
