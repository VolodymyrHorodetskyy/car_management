package com.carmanagement.repository;

import com.carmanagement.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *  created by Volodymyr Horodetskyi
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByNameAndPassword(String name, String password);
}
