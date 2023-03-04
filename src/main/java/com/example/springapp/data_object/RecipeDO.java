package com.example.springapp.data_object;

import com.example.springapp.entity.Recipe;
import jakarta.annotation.Nonnull;

import java.time.LocalDateTime;
import java.util.List;

public class RecipeDO {
    private String title;
    private String description;
    private LocalDateTime createdOn;
    private LocalDateTime modifiedOn;
    private List<RecipeElementDO> ingredients;

    public RecipeDO() {
        // json
    }

    public RecipeDO(@Nonnull final Recipe recipe) {
        this.title = recipe.getTitle();
        this.description = recipe.getDescription();
        this.createdOn = recipe.getCreatedOn();
        this.modifiedOn = recipe.getModifiedOn();
        this.ingredients = recipe.getIngredients().stream()
                .map(RecipeElementDO::new)
                .toList();
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

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(LocalDateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public List<RecipeElementDO> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<RecipeElementDO> ingredients) {
        this.ingredients = ingredients;
    }
}
