package com.cooking.recepie.website.cookingwebsite.repository;

import com.cooking.recepie.website.cookingwebsite.model.RecipePost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


public interface RecipeRepository extends JpaRepository<RecipePost, Long> {
    List<RecipePost> findByusersId(UUID id);
}