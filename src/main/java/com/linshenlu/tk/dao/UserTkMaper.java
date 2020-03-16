package com.linshenlu.tk.dao;

import com.linshenlu.tk.base.BaseTkMaper;
import com.linshenlu.tk.entity.UserModel;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan
@Mapper
public interface UserTkMaper extends BaseTkMaper<UserModel> {
}
