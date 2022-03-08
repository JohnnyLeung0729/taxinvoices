package com.taxinvoicesautodbconfiggen.controller;

import com.taxinvoicesautodbconfiggen.helper.TCCodeGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gen")
public class GenFileSysController {

    @RequestMapping("/start")
    public String genfilesys(){

        TCCodeGenerator.main();
        return "Hello World~!";
    }
}
