package com.linshenlu.tk.service.impl;

import com.linshenlu.tk.base.BaseServiceImpl;
import com.linshenlu.tk.base.BaseTkMapper;
import com.linshenlu.tk.dao.DeptMapper;
import com.linshenlu.tk.entity.Dept;
import com.linshenlu.tk.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wen
 * @create 2020/3/16 23:00
 */
@Service
public class DeptServiceImpl extends BaseServiceImpl<Dept> implements DeptService {
    /*@Autowired
    private DeptMapper deptMapper;*/
    /*@Override
    public BaseTkMapper<Dept> getMapper() {
        return deptMapper;
    }*/
}
