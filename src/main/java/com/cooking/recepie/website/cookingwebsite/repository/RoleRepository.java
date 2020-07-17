package com.cooking.recepie.website.cookingwebsite.repository;

import com.cooking.recepie.website.cookingwebsite.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}