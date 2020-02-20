package com.linshenlu.tk.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC") // 新增数据后，可以直接返回主键，数据库支持主键自增
    private Integer id;
    @Column
    private String userName;
    @Column
    private String userPhone;
    @Column
    private Double salary;
    @Column
    private Integer age;
}
