package com.tonechentaxinvoice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tonechentaxinvoice.Entity.UserEntity;

import java.util.List;

public interface UserService extends IService<UserEntity> {
    List<UserEntity> getUsers();

    List<UserEntity> getUsersBySex(String sex);
}
