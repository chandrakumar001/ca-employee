package com.chstore.ca.employee;

import com.chstore.ca.ms.tracking.CHRequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@SpringBootApplication
@RestController
@Slf4j
public class CaEmployeeApplication {

    @Autowired
    CHRequestContext chRequestContext;

    @GetMapping("/")
    public String helloWorld() {

        log.info("{}", Objects.isNull(chRequestContext));
        System.out.println(Objects.isNull(chRequestContext));
        return "Hello world and 'loaded spring factory bean ='" + Objects.nonNull(chRequestContext);
    }

    @GetMapping("/ex")
    public String helloWorldEx() {
        throw new RuntimeException("thrown exception");
    }

    public static void main(String[] args) {
        SpringApplication.run(CaEmployeeApplication.class, args);
    }

}
