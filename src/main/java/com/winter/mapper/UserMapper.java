package com.winter.mapper;

import com.winter.model.User;

import java.util.List;

public interface UserMapper {

    int addUser(User user);

    int deleteUser(User user);

    int updateUser(User user);

    User getUserById(User user);

    List<User> selectAllUser();
}