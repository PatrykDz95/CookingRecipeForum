package com.cooking.recepie.website.cookingwebsite.service;

import com.cooking.recepie.website.cookingwebsite.model.RecipePost;
import com.cooking.recepie.website.cookingwebsite.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<RecipePost> getAllRecipes(){
        return recipeRepository.findAll();
    }

}
