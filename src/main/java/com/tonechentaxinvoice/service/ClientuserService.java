package com.tonechentaxinvoice.service;

import com.tonechentaxinvoice.entity.Clientuser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author JohnnyLeung
 * @since 2022-03-08
 */
public interface ClientuserService extends IService<Clientuser> {

    //    获取所有电票客户清单
    List<Clientuser> getClientUsers();
}
