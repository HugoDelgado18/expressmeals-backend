//package com.expressmealsapp.expressmeals.controllers;
//
//import com.expressmealsapp.expressmeals.models.User;
//import com.expressmealsapp.expressmeals.repository.MealRepository;
//import com.expressmealsapp.expressmeals.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/user/meal")
//public class UserMealController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private MealRepository mealRepository;
//
//    public UserMealController(UserRepository userRepository, MealRepository mealRepository) {
//        this.userRepository = userRepository;
//        this.mealRepository = mealRepository;
//    }
//
//    @PostMapping
//    public User saveUserWithMeal(@RequestBody User user){
//        return userRepository.save(user);
//    }
//
//
//
//}
