package com.carmanagement.repository;

import com.carmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  created by Volodymyr Horodetskyi
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByNameAndPassword(String name, String password);
}
