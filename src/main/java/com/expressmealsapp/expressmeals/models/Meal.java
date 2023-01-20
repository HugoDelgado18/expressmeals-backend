package com.expressmealsapp.expressmeals.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Meal {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double price;
    private long calories;
    private long serving_size;
    private String description;
    private String ingredients;

    private String imageUrl;
    private Boolean vegan;
    private Boolean vegetarian;

    @ManyToMany(mappedBy = "meals", fetch = FetchType.LAZY)
    private Set<User> users;

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
