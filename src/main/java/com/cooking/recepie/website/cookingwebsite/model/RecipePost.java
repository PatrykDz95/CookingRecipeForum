package com.cooking.recepie.website.cookingwebsite.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "recipe-post")
public class RecipePost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, length=50)
    private String title;

    @Column(name = "shortDescription", nullable = false, length=50)
    private String shortDescription;

    @Column(name = "description", nullable = false, length=50)
    private String description;

}
