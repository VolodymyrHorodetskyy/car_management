package com.carmanagement;

import com.carmanagement.entity.User;
import com.carmanagement.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * created by Volodymyr Horodetskyi
 */
@SpringBootApplication
public class CarmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarmanagementApplication.class, args);
    }

    @Bean
    public ApplicationRunner initializer(UserRepository userRepository) {
        return args -> userRepository.saveAll(
                Arrays.asList(new User("user1", "pass1"),
                        new User("user2", "pass2")
                ));
    }
}
