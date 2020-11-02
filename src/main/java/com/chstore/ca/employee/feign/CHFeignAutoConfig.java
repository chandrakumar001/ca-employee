package com.chstore.ca.employee.feign;

import com.chstore.ca.ms.tracking.CHRequestContext;
import feign.Feign;
import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CHFeignAutoConfig {

    @Bean
    public Retryer retryer() {
        return new CHFeignRetry();
    }

 /*   @Bean
    Request.Options feignOptions() {
        return new Request.Options(
                1 * 5,
                1 * 5);
    }*/

    @Bean
    Logger.Level chFeignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public CHFeignErrorDecoder myErrorDecoder() {
        return new CHFeignErrorDecoder();
    }

    @Bean
    Feign chFeign(final CHFeignErrorDecoder myErrorDecoder,
                  final CHRequestContext chRequestContext,
                  final Retryer retryer
                  //final Request.Options feignOptions
                  ) {

        return Feign.builder()
                .requestInterceptor(new CHFeignInterceptor(
                        chRequestContext
                ))
                //.options(feignOptions)
                .errorDecoder(myErrorDecoder)
                .retryer(retryer)
                .build()
                //  .contract(feignContract)
                // .encoder(new JacksonDecoder(mapper))
                // .decoder(new JacksonDecoder(mapper))
                ;
    }
}