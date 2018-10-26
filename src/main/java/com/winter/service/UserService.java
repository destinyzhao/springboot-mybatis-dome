package com.winter.service;

import com.winter.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    int deleteUser(User user);

    int updateUser(User user);

    User getUserById(User user);

    List<User> findAllUser();
}
