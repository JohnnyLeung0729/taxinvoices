package com.tonechentaxinvoice.service.impl;

import com.tonechentaxinvoice.entity.Clientuser;
import com.tonechentaxinvoice.mapper.ClientuserMapper;
import com.tonechentaxinvoice.service.ClientuserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JohnnyLeung
 * @since 2022-03-08
 */
@Service
public class ClientuserServiceImpl extends ServiceImpl<ClientuserMapper, Clientuser> implements ClientuserService {

//    @Resource
//    private Clientuser clientuserMapper;

    @Override
    public List<Clientuser> getClientUsers() {
        return this.list();
    }
}
