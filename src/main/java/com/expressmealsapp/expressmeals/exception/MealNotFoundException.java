package com.expressmealsapp.expressmeals.exception;

public class MealNotFoundException extends RuntimeException{
    public MealNotFoundException(Long id){
        super("Could not find the user with id " + id);
    }
}
