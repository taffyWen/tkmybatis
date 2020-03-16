package com.linshenlu.tk.dao;

import com.linshenlu.tk.base.BaseTkMapper;
import com.linshenlu.tk.entity.UserModel;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wen
 */
@Mapper
public interface UserTkMapper extends BaseTkMapper<UserModel> {
}
