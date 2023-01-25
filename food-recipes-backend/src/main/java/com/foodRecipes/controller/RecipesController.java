package com.foodRecipes.controller;

import com.foodRecipes.entity.Recipes;
import com.foodRecipes.service.RecipesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RecipesController {

    @Autowired
    RecipesService recipesService;

    @GetMapping("recipes")
    public ResponseEntity<List<Recipes>> getAllRecipes(){
        List<Recipes> recipes = recipesService.getAllRecipes();
        return new ResponseEntity<>(recipes, HttpStatus.OK);
    }
}
