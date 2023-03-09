package com.example.springapp.repository;


import com.example.springapp.entity.RecipeVersion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeVersionRepository extends JpaRepository<RecipeVersion, Long> {
    List<RecipeVersion> findAllByRecipeId(Long recipeId);
}
