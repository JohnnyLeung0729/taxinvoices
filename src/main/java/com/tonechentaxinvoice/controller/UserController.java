package com.tonechentaxinvoice.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.tonechentaxinvoice.Entity.UserEntity;
import com.tonechentaxinvoice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService userService;

    @GetMapping("/get-users")
    public List<Map<String,Object>> getUserList(){
        String sql="select * from user";
        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        return list;
    }

    @GetMapping("/get-users2")
    public List<UserEntity> getUserList2(){
        return userService.getUsers();
    }

    @GetMapping("/get-users-by-sex")
    public List<UserEntity> getUsersBySex(@RequestParam(name="sex") String sex){
        return userService.getUsersBySex(sex);
    }

    @GetMapping("/get-users-by-sex-age")
    public List<UserEntity> getUserBySexAndAge(@RequestParam(name="sex") String sex,@RequestParam(name="age") Integer age){
        LambdaQueryWrapper<UserEntity> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(UserEntity::getSex,sex);
        queryWrapper.eq(UserEntity::getAge,age);

        return userService.list(queryWrapper);
    }
}
