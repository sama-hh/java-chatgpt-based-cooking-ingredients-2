package com.example.chatgptbasedcookingingredients;


import com.example.chatgptbasedcookingingredients.service.CategorizeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingredients")
@RequiredArgsConstructor
public class IngredientController {

    private final CategorizeService categorizeService;

    @PostMapping
    String categorizeIngredient(@RequestBody String ingredient) {
        // TODO: This should return "vegan", "vegetarian" or "regular" depending on the ingredient.
        String answer = categorizeService.categorize(ingredient);
        return answer;
    }

}
