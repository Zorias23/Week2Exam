package com.example.admin.week2exam.jungle;

/**
 * Created by Admin on 11/18/2017.
 */

public class Monkey extends Animal implements Activity{
        public Monkey()
        {
            super();
            setSound("OOOhhh OOOOO Ahhhh Ahhhh!!!");
            super.setType("Monkey");
        }
    @Override
    public void makeSound() {
        updateEnergyLevel(-4);
        System.out.println(getSound());
    }

    @Override
    public void eatFood() {
        setFood(Jungle.getFood());
        updateEnergyLevel(2);
    }

    @Override
    public void sleep() {
        updateEnergyLevel(Animal.SLEEP);
    }
    private void play()
    {

        updateEnergyLevel(-8);
        if (getEnergy_level() > 0)
        {
            System.out.println(getSound());
        }
        else
        {
            System.out.println("Monkey is too tired to play :(");
        }
    }
}
