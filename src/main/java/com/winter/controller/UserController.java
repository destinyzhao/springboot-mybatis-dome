package com.winter.controller;

import com.winter.model.User;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*Get方式方便web测试*/

    /*增加用户*/
    // http://localhost:8080/user/addUser/?userName=Alex&userAge=20
    @ResponseBody
    @RequestMapping(value = "/addUser", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    /*删除用户*/
    // http://localhost:8080/user/deleteUser/?userId=2
    @ResponseBody
    @RequestMapping(value = "/deleteUser",produces = {"application/json;charset=UTF-8"})
    public  int deleteUser(User user){
        return userService.deleteUser(user);
    }

    /*修改用户*/
    // http://localhost:8080/user/updateUser/?userId=3&userName=刘牧师&userAge=50
    @ResponseBody
    @RequestMapping(value = "/updateUser",produces = {"application/json;charset=UTF-8"})
    public  int  updateUser(User user){
        return userService.updateUser(user);
    }

    /*根据UserId查找用户*/
    // http://localhost:8080/user/getUserById/?userId=3
    @ResponseBody
    @RequestMapping(value = "/getUserById", produces = {"application/json;charset=UTF-8"})
    public User getUserById(User user){
        return userService.getUserById(user);
    }

    /*查询所有用户*/
    // http://localhost:8080/user/getAllUsers
    @ResponseBody
    @RequestMapping(value = "/getAllUsers", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(){
        return userService.findAllUser();
    }
}
