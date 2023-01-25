package com.foodRecipes.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "recipes")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recipes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "recipe_name")
    private String recipeName;

    @Column(name = "recipe_ingredients")
    private String recipeIngredients;

    @Column(name = "recipe_process")
    private String recipeProcess;

    @Column(name = "recipe_creator")
    private String recipeCreator;
}
