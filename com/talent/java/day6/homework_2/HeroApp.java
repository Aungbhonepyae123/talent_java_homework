package com.talent.java.day6.homework_2;

import java.util.ArrayList;
import java.util.List;

public class HeroApp {
    public static void main(String[] args) {
        List<SuperHero> justiceLeague = new ArrayList<>();

        justiceLeague.add(new FlyingHero("SuperManh", 85));
        justiceLeague.add(new StrengthHero("BatMan", 95));
        justiceLeague.add(new SpeedHero("Flash", 90));

        System.out.println("--- Heroes Assemble! ---");
        for (SuperHero hero : justiceLeague) {
            System.out.println(hero);
            hero.usePower();
            hero.powerBoost(10);
            System.out.println("-----------------------");
        }
    }
}