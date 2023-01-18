package com.expressmealsapp.expressmeals.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Meal {
    @Id
    private long id;
    private String name;
    private double price;
    private long calories;
    private long serving_size;
    private String description;
    private Boolean vegan;
    private Boolean vegetarian;

    public Meal(){

    }

    public Meal(long id, String name, double price, long calories, long serving_size, String description, Boolean vegan, Boolean vegetarian) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.serving_size = serving_size;
        this.description = description;
        this.vegan = vegan;
        this.vegetarian = vegetarian;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getCalories() {
        return calories;
    }

    public long getServing_size() {
        return serving_size;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCalories(long calories) {
        this.calories = calories;
    }

    public void setServing_size(long serving_size) {
        this.serving_size = serving_size;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", serving_size=" + serving_size +
                ", description='" + description + '\'' +
                ", vegan=" + vegan +
                ", vegetarian=" + vegetarian +
                '}';
    }
}
