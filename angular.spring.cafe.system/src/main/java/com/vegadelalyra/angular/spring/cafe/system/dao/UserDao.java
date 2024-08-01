package com.vegadelalyra.angular.spring.cafe.system.dao;

import com.vegadelalyra.angular.spring.cafe.system.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmailId(@Param("email") String email);
}
