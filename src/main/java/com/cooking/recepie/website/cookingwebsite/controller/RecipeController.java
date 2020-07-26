package com.cooking.recepie.website.cookingwebsite.controller;

import com.cooking.recepie.website.cookingwebsite.model.RecipePost;
import com.cooking.recepie.website.cookingwebsite.service.RecipeService;
import com.cooking.recepie.website.cookingwebsite.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

    @GetMapping("/posts")
    public String postByUser(Model theModel) {

        theModel.addAttribute("allRecipes", recipeService.getAllRecipes());

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(String.format("Received allRecipes [%s] on `allPosts`!", theModel.toString()));
        }

        return "posts";
    }

    @GetMapping("/post/{username}")
    public String postByUser(Model theModel, @PathVariable String username) {

         List<RecipePost> recipeByUser = recipeService.findByUser(userService.findByUsername(username));

         theModel.addAttribute("recipeByUser", recipeByUser);

        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(String.format("Received recipeByUser [%s] on `postByUser`!", username.toString()));
        }

         return "post";
    }

}
