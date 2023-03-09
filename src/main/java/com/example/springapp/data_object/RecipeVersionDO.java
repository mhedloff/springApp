package com.example.springapp.data_object;

import java.time.LocalDateTime;
import java.util.List;

public class RecipeVersionDO {
    private Long id;
    private Long recipeId;
    private LocalDateTime createdOn;
    private LocalDateTime modifiedOn;
    private List<RecipeElementDO> recipeElements;

    public RecipeVersionDO() {
        // jpa and mappers
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
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

    public List<RecipeElementDO> getRecipeElements() {
        return recipeElements;
    }

    public void setRecipeElements(List<RecipeElementDO> recipeElements) {
        this.recipeElements = recipeElements;
    }
}
