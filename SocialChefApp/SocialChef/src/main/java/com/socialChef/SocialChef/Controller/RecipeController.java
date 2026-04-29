package com.socialChef.SocialChef.Controller;

import com.socialChef.SocialChef.Service.RecipeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private final RecipeService RecipeService;
    public RecipeController(RecipeService recipeService){
        RecipeService = recipeService;
    }

    @PostMapping("/parse-recipe")
    void ParseRecipeFrom(@RequestBody String recipeFromPostUrl){
        String recipeLink = recipeFromPostUrl;
        System.out.println(recipeLink);
    }
}
