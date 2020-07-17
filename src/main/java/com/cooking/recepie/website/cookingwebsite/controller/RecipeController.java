package com.cooking.recepie.website.cookingwebsite.controller;

import com.cooking.recepie.website.cookingwebsite.model.RecipePost;
import com.cooking.recepie.website.cookingwebsite.service.RecipeService;
import com.cooking.recepie.website.cookingwebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @Autowired
    private UserService userService;

    @GetMapping("/posts")
    public String allPosts(Model theModel) {

        List<RecipePost> recipeServices = recipeService.getAllRecipes();

        theModel.addAttribute("allRecipes", recipeService.getAllRecipes());

        return "posts";
    }

    @GetMapping("/post/{username}")
    public String allPosts(Model theModel, @PathVariable String username) {

         List<RecipePost> recipeByUser = recipeService.findByUser(userService.findByUsername(username));

         theModel.addAttribute("recipeByUser", recipeByUser);

         return "post";
    }

}
