package com.vegadelalyra.angular.spring.cafe.system.dao;

import com.vegadelalyra.angular.spring.cafe.system.POJO.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category, Integer> {
    List<Category> getAllCategory();
}
