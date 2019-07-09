package com.madolche.kawayi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName(value = "animal")
public class Animal {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "name", exist = true)
    private String Name;
    private String color;
    private Integer age;

    @TableField(value = "last_name", exist = true)
    private String lastName;
}
