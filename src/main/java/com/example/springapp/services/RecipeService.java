package com.example.springapp.services;

import com.example.springapp.data_object.RecipeDO;
import com.example.springapp.data_object.RecipeVersionDO;
import com.example.springapp.entity.Recipe;
import jakarta.annotation.Nonnull;

import java.util.List;

@SuppressWarnings({"java:S125", "java:S1135"}) // to be done later
public interface RecipeService {
    List<Recipe> findAll();
    RecipeDO findById(Long id);
    List<RecipeVersionDO> findRecipeVersions(@Nonnull final Long recipeId);
    Recipe update(@Nonnull final Long id, @Nonnull final Recipe recipe);
    void delete(@Nonnull final Long id);
}
