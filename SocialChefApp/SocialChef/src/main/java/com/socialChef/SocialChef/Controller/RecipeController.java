package com.socialChef.SocialChef.Controller;

import com.socialChef.SocialChef.Service.RecipeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService RecipeService;
    public RecipeController(RecipeService recipeService){
        RecipeService = recipeService;
    }

    @PostMapping("/recipes/parse-recipe")
    void ParseRecipeFrom(String recipeFromPostUrl){

    }
}
