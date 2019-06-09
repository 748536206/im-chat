package com.instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImChatApplication {
    private static Logger log = LoggerFactory.getLogger(ImChatApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ImChatApplication.class, args);
        log.info("------------------im-chat启动完成----------------------------");
    }

}
