package com.talent.java.day6.homework_2;

class SpeedHero extends SuperHero {
    public SpeedHero(String name, int level) {
        super(name, level);
    }

    @Override
    public void usePower() {
        System.out.println(heroName + " moves so fast ");
    }
}
