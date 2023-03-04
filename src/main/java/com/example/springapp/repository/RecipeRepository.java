package com.example.springapp.repository;

import com.example.springapp.entity.Recipe;
import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAllByCreatedOnBetween(@Nonnull final LocalDateTime start, @Nonnull final LocalDateTime end);
}
