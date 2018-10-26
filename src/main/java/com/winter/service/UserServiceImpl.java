package com.winter.service;

import com.winter.mapper.UserMapper;
import com.winter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(User user){
        return userMapper.deleteUser(user);
    }

    @Override
    public  int updateUser(User user){
        return userMapper.updateUser(user);
    }

    @Override
    public  User getUserById(User user){
        return userMapper.getUserById(user);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAllUser();
    }
}
