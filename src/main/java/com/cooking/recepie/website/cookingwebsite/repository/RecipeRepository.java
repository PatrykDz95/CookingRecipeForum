package com.cooking.recepie.website.cookingwebsite.repository;

import com.cooking.recepie.website.cookingwebsite.model.RecipePost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<RecipePost, Long> {
}