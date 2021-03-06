package com.tonechentaxinvoice.service.impl;

import com.tonechentaxinvoice.entity.User;
import com.tonechentaxinvoice.mapper.UserMapper;
import com.tonechentaxinvoice.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JohnnyLeung
 * @since 2022-03-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
