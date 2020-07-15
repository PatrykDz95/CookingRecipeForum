package com.cooking.recepie.website.cookingwebsite.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class RecipePost {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long  id;

    @Column(nullable = false, length=50)
    private String title;

    @Column(nullable = false, length=50)
    private String shortDescription;

    @Column(nullable = false, length=300)
    private String description;

    @Column(nullable = false, length=300)
    private Date postDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private User users;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "RecipePost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", description='" + description + '\'' +
                ", users=" + users +
                '}';
    }
}
