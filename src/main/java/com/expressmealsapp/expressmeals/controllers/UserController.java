package com.expressmealsapp.expressmeals.controllers;

import com.expressmealsapp.expressmeals.exception.UserNotFoundException;
import com.expressmealsapp.expressmeals.models.Meal;
import com.expressmealsapp.expressmeals.models.User;
import com.expressmealsapp.expressmeals.repository.MealRepository;
import com.expressmealsapp.expressmeals.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MealRepository mealRepository;


    @GetMapping("/user")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id){
        return userRepository.findById(id)
            .orElseThrow(()->new UserNotFoundException(id));
    }



    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @PutMapping("/user/{userId}/meal/{mealId}")
    User assignMeal(@PathVariable Long userId, @PathVariable Long mealId){
        Meal meal = mealRepository.findById(mealId).get();
        User user = userRepository.findById(userId).get();

        user.addMeal(meal);
        return userRepository.save(user);


    }

    @GetMapping("/user/username/{name}")
    public List getUserByUsername(@PathVariable String name){
        return userRepository.findByUsername(name);
    }

    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id){
        return userRepository.findById(id)
                .map(user-> {
                    user.setFirstname(newUser.getFirstname());
                    user.setLastname(newUser.getLastname());
                    user.setUsername(newUser.getUsername());
                    user.setPassword(newUser.getPassword());
                    user.setEmail(newUser.getEmail());
                    user.setAddress(newUser.getAddress());
                    user.setSubscribed(newUser.getSubscribed());
                    user.setSubscriptionType(newUser.getSubscriptionType());
                    user.setVegan(newUser.getVegan());
                    user.setVegetarian(newUser.getVegetarian());
                    user.setRecipesPerWeek(newUser.getRecipesPerWeek());
                    user.setOrderTotal(newUser.getOrderTotal());
                    return userRepository.save(user);
                }).orElseThrow(()->new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id){
        if(!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User has been deleted";
    }

}
