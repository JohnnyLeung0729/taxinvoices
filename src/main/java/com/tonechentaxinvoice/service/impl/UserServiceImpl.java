package com.tonechentaxinvoice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tonechentaxinvoice.Entity.UserEntity;
import com.tonechentaxinvoice.dao.UserMapper;
import com.tonechentaxinvoice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,UserEntity> implements UserService {
    @Override
    public List<UserEntity> getUsers() {
        return this.list();
    }

    @Override
    public List<UserEntity> getUsersBySex(String sex) {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("sex",sex);
        List<UserEntity> list=this.list(wrapper);
        return list;
    }
}
