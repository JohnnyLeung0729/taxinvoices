package com.tonechentaxinvoice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tonechentaxinvoice.mapper")
public class TonechentaxinvoiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TonechentaxinvoiceApplication.class, args);
    }

}
