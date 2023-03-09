package com.example.springapp.controllers;

import com.example.springapp.data_object.RecipeDO;
import com.example.springapp.data_object.RecipeVersionDO;
import com.example.springapp.entity.Recipe;
import com.example.springapp.services.RecipeService;
import jakarta.annotation.Nonnull;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @GetMapping
    @Nonnull
    public List<RecipeDO> findAllRecipes() {
        return recipeService.findAll().stream().map(RecipeDO::new).toList();
    }

    @GetMapping("/{id}")
    @Nonnull
    public RecipeDO findById(@PathVariable(name = "id") @Nonnull final Long id) {
        return recipeService.findById(id);
    }

    @GetMapping("/{id}/versions")
    @Nonnull
    public List<RecipeVersionDO> findRecipeVersions(@PathVariable(name = "id") @Nonnull final Long id) {
        return recipeService.findRecipeVersions(id);
    }

    @PostMapping
    public void createRecipe(@RequestBody Recipe recipe) {
        throw new NotYetImplementedException("To be done");
    }
}
