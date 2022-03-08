package com.tonechentaxinvoice.controller;


import com.tonechentaxinvoice.entity.Clientuser;
import com.tonechentaxinvoice.service.ClientuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

}

