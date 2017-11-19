package com.example.admin.week2exam.jungle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 11/18/2017.
 */

public class Animal implements Activity {
    public static List<Animal> animals = new ArrayList<Animal>();
    private int energy_level = 0;
    public static final int MAKE_SOUND = -3;
    public static final int EAT_FOOD = 5;
    public static final int SLEEP = 10;
    private String sound;
    private String food;
    private String type = "";
    public static List<Animal> getAnimals()
    {
        return animals;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getEnergy_level() {
        return energy_level;
    }

    public void setEnergy_level(int energy_level) {
        this.energy_level = energy_level;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Animal()
    {
        animals.add(this);
    }
    public void updateEnergyLevel(int num)
    {
        energy_level += num;
    }
    public int numberOfMySpecies()
    {
        int count = 0;
        for (Animal a: animals)
        {
            if (a.getType().equals(this.getType()) )
            {
                count++;
            }
        }
        System.out.println("There are " + count + " members of my species in the jungle.");
        return count;
    }

    @Override
    public void makeSound() {
        updateEnergyLevel(MAKE_SOUND);
    }

    @Override
    public void eatFood() {
        updateEnergyLevel(EAT_FOOD);
    }

    @Override
    public void sleep() {
        updateEnergyLevel(SLEEP);
    }
}
