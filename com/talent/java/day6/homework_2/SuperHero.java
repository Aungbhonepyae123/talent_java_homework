package com.talent.java.day6.homework_2;

public abstract class SuperHero {
    //Fields
    protected String heroName;
    protected int powerLevel;

    //Constructor
    public SuperHero(String heroName, int powerLevel) {
        this.heroName = heroName;
        this.powerLevel = powerLevel;
    }

    public abstract void usePower();

    public void powerBoost(int amount) {
        this.powerLevel += amount;
        System.out.println(heroName + " boosted! New Power Level: " + powerLevel);
    }

    @Override
    public String toString() {
        return heroName + " [Level: " + powerLevel + "]";
    }
}
