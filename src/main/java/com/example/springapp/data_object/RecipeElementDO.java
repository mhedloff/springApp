package com.example.springapp.data_object;

import com.example.springapp.entity.RecipeElement;

public class RecipeElementDO {
    private Double quantity;
    private String unit;
    private String name;
    private boolean vegan;
    private boolean vegetarian;
    private boolean glutenFree;

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

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
}
