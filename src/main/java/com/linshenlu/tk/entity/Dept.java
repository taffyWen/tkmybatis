package com.linshenlu.tk.entity;

import lombok.Data;

import javax.persistence.Id;

/**
 * @Author wen
 * @create 2020/3/16 22:58
 */
@Data
public class Dept {

    @Id
    private Integer id;
    private String name;
}
