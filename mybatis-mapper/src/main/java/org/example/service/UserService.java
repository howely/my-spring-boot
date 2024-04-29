package org.example.service;

import jakarta.annotation.Resource;
import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User getUser() {
        return userMapper.getUser();
    }

    public List<User> listUsers() {
        return userMapper.listUser();
    }

}
