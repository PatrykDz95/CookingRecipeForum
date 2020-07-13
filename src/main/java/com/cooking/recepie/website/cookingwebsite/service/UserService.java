package com.cooking.recepie.website.cookingwebsite.service;


import com.cooking.recepie.website.cookingwebsite.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);

}