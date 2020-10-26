package com.chstore.ca.employee;

import com.chstore.ca.ms.tracking.CHRequestContext;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        return "Hello world and 'loaded spring factory bean ='" + Objects.nonNull(chRequestContext);
    }

    @GetMapping("/ex")
    public String helloWorldEx() {
        throw new RuntimeException("thrown exception");
    }

    @PostMapping("/")
    public void postHelloWorld(@RequestBody Test test) {
        log.info("{}", Objects.nonNull(test));
    }

    public static void main(String[] args) {
        SpringApplication.run(CaEmployeeApplication.class, args);
    }

}

@Setter
@Getter
@NoArgsConstructor
class Test {
    private String name;
}