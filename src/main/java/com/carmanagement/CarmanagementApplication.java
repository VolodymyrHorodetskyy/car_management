package com.carmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

/**
 * created by Volodymyr Horodetskyi
 */
@SpringBootApplication
@EnableJdbcHttpSession
public class CarmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarmanagementApplication.class, args);
    }

}
