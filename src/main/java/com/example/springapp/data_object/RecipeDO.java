package com.example.springapp.data_object;

import com.example.springapp.entity.Recipe;
import jakarta.annotation.Nonnull;

public class RecipeDO {
    private String title;
    private String description;

    public RecipeDO() {
        // json
    }

    public RecipeDO(@Nonnull final Recipe recipe) {
        this.title = recipe.getTitle();
        this.description = recipe.getDescription();
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

}
