package com.example.springapp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @OneToMany(mappedBy = "recipeId", fetch = FetchType.LAZY)
    private List<RecipeVersion> recipeVersions;

    public Recipe() {
        // needed for JPA
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<RecipeVersion> getRecipeVersions() {
        return recipeVersions;
    }

    public void setRecipeVersions(List<RecipeVersion> recipeVersions) {
        this.recipeVersions = recipeVersions;
    }
}
