package com.example.admin.week2exam.jungle;

import java.util.List;
import java.util.Random;

/**
 * Created by Admin on 11/18/2017.
 */

public class Jungle {
    static String[] food = {"meat", "fish", "bugs", "grain"};

    public static String getFood()
    {
        Random r = new Random();
        return food[r.nextInt(food.length-1)];
    }
    public static String getFoodTiger()
    {
        Random r = new Random();
        return food[r.nextInt(food.length-2)];
    }
    public void soundOff()
    {
        List<Animal> animals = Animal.getAnimals();
        for (Animal a: animals)
        {
            a.makeSound();
            System.out.println("My energy level is " + a.getEnergy_level());
        }
    }
}
