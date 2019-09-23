package com.madolche.kawayi.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.madolche.kawayi.entity.User;
import com.madolche.kawayi.mapper.UserMapper;
import com.madolche.kawayi.service.IUserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    public int addUser() {
        return baseMapper.insert(new User());
    }
}
