package com.tonechentaxinvoice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tonechentaxinvoice.entity.UserEntity;
import com.tonechentaxinvoice.mapper.UserMapper;
import com.tonechentaxinvoice.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,UserEntity> implements UserService {

//    @Resource
//    private UserMapper userMapper;
//
//    @Override
//    public List<UserEntity> getUsers() {
//        return this.list();
//    }
//
//    @Override
//    public List<UserEntity> getUsersBySex(String sex) {
//        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
//        wrapper.eq("sex",sex);
//        List<UserEntity> list=this.list(wrapper);
//        return list;
//    }
//
//    @Override
//    public UserEntity getUserById(Integer userId) {
//        return userMapper.getUserById(userId);
//    }

}
