package com.madolche.kawayi.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.madolche.kawayi.entity.User;

public interface IUserService extends IService<User> {
    int addUser();
}
