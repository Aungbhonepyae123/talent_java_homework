package com.talent.java.day6.homework_2;

class StrengthHero extends SuperHero {
    public StrengthHero(String name, int level) {
        super(name, level);
    }

    @Override
    public void usePower() {
        System.out.println(heroName + " smashes !");
    }
}
