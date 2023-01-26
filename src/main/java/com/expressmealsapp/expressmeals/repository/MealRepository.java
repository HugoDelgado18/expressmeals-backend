package com.expressmealsapp.expressmeals.repository;

import com.expressmealsapp.expressmeals.models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {


}
