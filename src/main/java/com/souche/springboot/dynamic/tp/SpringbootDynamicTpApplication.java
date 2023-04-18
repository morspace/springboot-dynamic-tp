package com.souche.springboot.dynamic.tp;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.dtp.core.spring.EnableDynamicTp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamicTp
@EnableApolloConfig
public class SpringbootDynamicTpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDynamicTpApplication.class, args);
    }

}
