package com.foodRecipes.serviceImplementation;

import com.foodRecipes.entity.Recipes;
import com.foodRecipes.repository.RecipeRepository;
import com.foodRecipes.service.RecipesService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RecipesServiceImpl implements RecipesService {

    @Autowired
    RecipeRepository recipeRepository;

    @Override
    public List<Recipes> getAllRecipes() {
        return recipeRepository.findAll();
    }
}
