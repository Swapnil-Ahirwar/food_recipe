package com.foodRecipes.repository;

import com.foodRecipes.entity.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipes, Long> {
}
