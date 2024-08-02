package com.vegadelalyra.angular.spring.cafe.system.dao;

import com.vegadelalyra.angular.spring.cafe.system.POJO.User;
import com.vegadelalyra.angular.spring.cafe.system.wrapper.UserWrapper;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmailId(@Param("email") String email);

    List<String> getAllAdmin();
    List<UserWrapper> getAllUser();

    @Transactional
    @Modifying
    Integer updateStatus(@Param("status") String status, @Param("id") Integer id);

}
