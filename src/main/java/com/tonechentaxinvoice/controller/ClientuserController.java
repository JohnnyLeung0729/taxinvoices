package com.tonechentaxinvoice.controller;


import com.tonechentaxinvoice.entity.Clientuser;
import com.tonechentaxinvoice.mapper.ClientuserMapper;
import com.tonechentaxinvoice.service.ClientuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JohnnyLeung
 * @since 2022-03-08
 */
@RestController
@RequestMapping("/fpopsoc")
public class ClientuserController {

    @Autowired
    private ClientuserService clientuserService;

    @GetMapping("/fp-open")
    public List<Clientuser> getUserList(){

        return clientuserService.getClientUsers();
    }

    @GetMapping("clientuser-add")
    public int addClientuser(){
        Clientuser cm=new Clientuser();
        cm.setEnterName("测试开票企业");
        cm.setEnterType(0);
        cm.setAct(1);
        cm.setIdkey(UUID.randomUUID().toString());
        cm.setMemo("Hello World fp");
        cm.setNsrsbh("1234567890");
        cm.setRegdate(new Date());
        cm.setChangedate(new Date());
        cm.setIdPic("");
        cm.setJpIdPicB("");
        cm.setJpIdPicF("");

        return clientuserService.saveClientuser(cm);
    }

}

