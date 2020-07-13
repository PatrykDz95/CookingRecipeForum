package com.cooking.recepie.website.cookingwebsite.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}