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
//@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;
    private String lastname;
    private String username;

    private String email;

    private String password;

    private String address;

    private Boolean subscribed = false;

    private String subscriptionType = "not subscribed";

    private Boolean vegan = false;
    private Boolean vegetarian = false;
    private Long recipesPerWeek;
    private Double orderTotal = 0.00;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "USER_MEAL_TABLE",
    joinColumns = {
            @JoinColumn(name = "user_id", referencedColumnName = "id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "meal_id", referencedColumnName = "id")
    }
    )
    private Set<Meal> meals;

    public void addMeal(Meal meal){
        meals.add(meal);
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", subscribed=" + subscribed +
                ", subscriptionType='" + subscriptionType + '\'' +
                ", vegan=" + vegan +
                ", vegetarian=" + vegetarian +
                ", recipesPerWeek=" + recipesPerWeek +
                ", orderTotal=" + orderTotal +
                ", meals=" + meals +
                '}';
    }
}
