package com.example.springapp.mapper;

import com.example.springapp.data_object.RecipeElementDO;
import com.example.springapp.data_object.RecipeVersionDO;
import com.example.springapp.entity.RecipeElement;
import com.example.springapp.entity.RecipeVersion;
import jakarta.annotation.Nonnull;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface RecipeVersionMapper {
    @Mapping(target = "recipeElements", source = "ingredients", qualifiedByName = "mapIngredients")
    RecipeVersionDO toDataObject(@Nonnull final RecipeVersion recipeVersion);

    @Named("mapIngredients")
    default List<RecipeElementDO> mapIngredients(@Nonnull final List<RecipeElement> recipeElements) {
        return recipeElements.stream()
                .map(RecipeElementDO::new)
                .toList();
    }
}
