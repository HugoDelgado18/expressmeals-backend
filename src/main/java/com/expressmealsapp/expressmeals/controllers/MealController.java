package com.expressmealsapp.expressmeals.controllers;

import com.expressmealsapp.expressmeals.exception.MealNotFoundException;
import com.expressmealsapp.expressmeals.exception.UserNotFoundException;
import com.expressmealsapp.expressmeals.models.Meal;
import com.expressmealsapp.expressmeals.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MealController {

    @Autowired
    private MealRepository mealRepository;

    @GetMapping("/meal")
    List<Meal> getAllMeals(){
        return mealRepository.findAll();
    }

    @GetMapping("/meal/{id}")
    Meal getMealById(@PathVariable Long id){
        return mealRepository.findById(id)
                .orElseThrow(()-> new MealNotFoundException(id));
    }

    @PostMapping("/meal")
    Meal newMeal(@RequestBody Meal newMeal){
        return mealRepository.save(newMeal);
    }

    @PutMapping("/meal/{id}")
    Meal updateMeal(@RequestBody Meal newMeal, @PathVariable Long id){
        return mealRepository.findById(id)
                .map(meal-> {
                    meal.setName(newMeal.getName());
                    meal.setPrice(newMeal.getPrice());
                    meal.setCalories(newMeal.getCalories());
                    meal.setServing_size(newMeal.getServing_size());
                    meal.setDescription(newMeal.getDescription());
                    meal.setVegan(newMeal.getVegan());
                    meal.setVegetarian(newMeal.getVegetarian());
                    meal.setIngredients(newMeal.getIngredients());
                    meal.setImageUrl(newMeal.getImageUrl());
                    return mealRepository.save(meal);
                }).orElseThrow(()->new MealNotFoundException(id));
    }

    @DeleteMapping("/meal/{id}")
    String deleteMeal(@PathVariable Long id){
        if(!mealRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        mealRepository.deleteById(id);
        return "Meal has been deleted";
    }


}
