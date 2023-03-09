package com.example.springapp.data_object;

import com.example.springapp.entity.RecipeElement;

public class RecipeElementDO {
    private final Double quantity;
    private final String unit;
    private final String name;
    private final boolean vegan;
    private final boolean vegetarian;
    private final boolean glutenFree;

    public RecipeElementDO(RecipeElement recipeElement) {
        this.quantity = recipeElement.getQuantity();
        this.unit = recipeElement.getUnit();
        this.name = recipeElement.getIngredient().getName();
        this.vegan = recipeElement.getIngredient().isVegan();
        this.vegetarian = recipeElement.getIngredient().isVegetarian();
        this.glutenFree = recipeElement.getIngredient().isGlutenFree();
    }

    public RecipeElementDO(Double quantity,
                           String unit,
                           String name,
                           boolean vegan,
                           boolean vegetarian,
                           boolean glutenFree) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
        this.vegan = vegan;
        this.vegetarian = vegetarian;
        this.glutenFree = glutenFree;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public boolean isVegan() {
        return vegan;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }
}
