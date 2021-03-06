package com.anson.controller;

import com.anson.model.User;
import com.anson.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: anson
 * @Date: 2019/9/5 0:42
 * @version: 1.0
 */

@RestController
@Api(value = "用户接口")
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userservice;

    @ApiOperation(value = "获取用户", notes = "根据id查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户id", required=true, dataType="int") //API参数
    @RequestMapping(value="/getUserById/{id}",method= RequestMethod.GET)
    public User selectByPrimaryKey(@PathVariable int id)
    {
        return userservice.selectByPrimaryKey(id);
    }

//    @ApiOperation(value = "增加用户", notes = "增加一个用户信息")
//    @RequestMapping(value="/insertUser/",method= RequestMethod.GET)
//    public  String insertUser()
//    {
//        User user = new User();
//        user.setId(3);
//        user.setPassword("123");
//        user.setUsername("kks");
//        user.setRealname("王五");
//        int kk = userservice.insert(user);
//        return  String.valueOf(kk);
//    }
}
