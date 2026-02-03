package com.talent.java.day6.homework_2;

class FlyingHero extends SuperHero {
    public FlyingHero(String name, int level) {
        super(name, level);
    }

    @Override
    public void usePower() {
        System.out.println(heroName + " flying in the sky");
    }
}

