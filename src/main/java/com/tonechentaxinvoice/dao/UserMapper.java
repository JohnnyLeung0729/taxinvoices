package com.tonechentaxinvoice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tonechentaxinvoice.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

    UserEntity getUserById(@Param("userid") Integer userid);

}
