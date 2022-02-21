package com.wjf.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.sun.javafx.beans.IDProperty;
import lombok.Data;

@Data
public class User {
    @TableId(type=IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Integer age;
}
