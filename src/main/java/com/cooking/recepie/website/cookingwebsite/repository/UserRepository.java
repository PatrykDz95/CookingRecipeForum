package com.cooking.recepie.website.cookingwebsite.repository;

import com.cooking.recepie.website.cookingwebsite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}