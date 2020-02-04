package com.linshenlu.tk.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="user")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Integer id;
    @Column
    private String userName;
    @Column
    private String userPhone;
    @Column
    private String salary;
    @Column
    private String age;
}
