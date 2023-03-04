package com.example.springapp.controllers;

import com.example.springapp.entity.Recipe;
import com.example.springapp.data_object.RecipeDO;
import com.example.springapp.repository.RecipeRepository;
import jakarta.annotation.Nonnull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeController(@Nonnull final RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping
    @Nonnull
    public List<RecipeDO> findAllRecipes() {
        return recipeRepository.findAll().stream().map(RecipeDO::new).toList();
    }

    @GetMapping("/{id}")
    @Nonnull
    public Recipe findById(@PathVariable(name = "id") @Nonnull final Long id) {
        return recipeRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void createRecipe(@RequestBody Recipe recipe) {
        recipeRepository.saveAndFlush(recipe);
    }

    @PostMapping("/filter")
    public List<Recipe> findByFilter(@RequestBody SearchFilter filter) {
        return recipeRepository.findAllByCreatedOnBetween(filter.getStart(), filter.getEnd());
    }
}
