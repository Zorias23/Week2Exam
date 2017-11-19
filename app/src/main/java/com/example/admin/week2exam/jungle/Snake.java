package com.example.admin.week2exam.jungle;

/**
 * Created by Admin on 11/18/2017.
 */

public class Snake extends Animal implements Activity {
    public Snake()
    {
        super();
        setSound("Hissssssss!!!");
        super.setType("Snake");
    }

    @Override
    public void makeSound() {
        updateEnergyLevel(Animal.MAKE_SOUND);
        System.out.println(getSound());
    }

    @Override
    public void eatFood() {
        setFood(Jungle.getFood());
        updateEnergyLevel(Animal.EAT_FOOD);
    }

    @Override
    public void sleep() {
        updateEnergyLevel(Animal.SLEEP);
    }
}
