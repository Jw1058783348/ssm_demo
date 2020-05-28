package com.qf.ssm_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Import(org.apache.poi.hssf.usermodel.HSSFWorkbook.class)
public class SsmDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(SsmDemoApplication.class, args);

    }

   /* @Bean
    public HSSFWorkbook getHSSFWorkbook(){
        return new HSSFWorkbook();
    }*/
}

