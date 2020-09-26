package com.yyece.hisserver;

import com.yyece.hisserver.utils.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.yyece.hisserver.dao")
public class HisServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HisServerApplication.class, args);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker();
    }
}
