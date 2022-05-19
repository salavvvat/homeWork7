package com.company;

public class Main {

    public static void main(String[] args) {
    Hero[] heroes = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < heroes.length ; i++) {
            heroesAbility(heroes[i]);
        }
    }

    public static void heroesAbility (Hero hero){
        System.out.println(new Magic().ApplySuperAbility("fireball"));
        System.out.println(new Medic().ApplySuperAbility("heal"));
        System.out.println(new Warrior().ApplySuperAbility("tamagawk"));
    }
}
