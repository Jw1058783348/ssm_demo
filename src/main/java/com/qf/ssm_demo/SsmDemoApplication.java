package com.qf.ssm_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@Import(org.apache.poi.hssf.usermodel.HSSFWorkbook.class)
public class SsmDemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        SpringApplication.run(SsmDemoApplication.class, args);

    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(SsmDemoApplication.class);
    }

   /* @Bean
    public HSSFWorkbook getHSSFWorkbook(){
        return new HSSFWorkbook();
    }*/
}

