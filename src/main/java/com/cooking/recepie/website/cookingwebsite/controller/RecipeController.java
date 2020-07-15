package com.cooking.recepie.website.cookingwebsite.controller;

import com.cooking.recepie.website.cookingwebsite.model.RecipePost;
import com.cooking.recepie.website.cookingwebsite.model.User;
import com.cooking.recepie.website.cookingwebsite.repository.RecipeRepository;
import com.cooking.recepie.website.cookingwebsite.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/posts")
    public String allPosts(Model theModel) {

        List<RecipePost> recipeServices = recipeService.getAllRecipes();

        theModel.addAttribute("allRecipes", recipeService.getAllRecipes());

        return "posts";
    }

}
