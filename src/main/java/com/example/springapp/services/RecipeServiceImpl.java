package com.example.springapp.services;

import com.example.springapp.data_object.RecipeDO;
import com.example.springapp.data_object.RecipeVersionDO;
import com.example.springapp.entity.Recipe;
import com.example.springapp.mapper.RecipeVersionMapper;
import com.example.springapp.repository.RecipeRepository;
import com.example.springapp.repository.RecipeVersionRepository;
import jakarta.annotation.Nonnull;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final RecipeVersionRepository recipeVersionRepository;
    private final RecipeVersionMapper recipeVersionMapper = Mappers.getMapper(RecipeVersionMapper.class);

    @Autowired
    public RecipeServiceImpl(@Nonnull final RecipeRepository recipeRepository,
                             @Nonnull final RecipeVersionRepository recipeVersionRepository) {
        this.recipeRepository = recipeRepository;
        this.recipeVersionRepository = recipeVersionRepository;
    }

    @Override
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    @Override
    public RecipeDO findById(Long id) {
        return recipeRepository.findById(id).map(RecipeDO::new).orElseThrow();
    }

    @Override
    public List<RecipeVersionDO> findRecipeVersions(Long recipeId) {
        return recipeVersionRepository.findAllByRecipeId(recipeId).stream().map(recipeVersionMapper::toDataObject).toList();
    }

    @Override
    public Recipe update(Long id, Recipe recipe) {
        return null;
    }

    @Override
    public void delete(Long id) {
        recipeRepository.deleteById(id);
    }
}
