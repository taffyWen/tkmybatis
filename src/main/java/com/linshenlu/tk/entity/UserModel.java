package com.linshenlu.tk.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="user")
public class UserModel {
    /**
     *  @Id 标记那个字段是主键
     *  使用场景是 **byPrimaryKey  必须要次注解，不然就会把所有字段当成组合主键了
     */
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

    /**
     * 数据库表中没有的字段
     */
    @Transient
    private Integer otherThing;
}
