package com.example.admin.week2exam.jungle;

/**
 * Created by Admin on 11/18/2017.
 */

public class Tiger extends Animal implements Activity{

    public Tiger()
    {
        super();
        setSound("Grroooowwwlllll");
        super.setType("Tiger");
    }
    @Override
    public void makeSound() {
        updateEnergyLevel(Animal.MAKE_SOUND);
        System.out.println(getSound());
    }

    @Override
    public void eatFood() {
        setFood(Jungle.getFoodTiger());
        updateEnergyLevel(Animal.EAT_FOOD);
    }

    @Override
    public void sleep() {
        updateEnergyLevel(5);
    }
}
