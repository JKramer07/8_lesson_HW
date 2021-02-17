package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic(100, 20);
        medic.applySuperAbility("");

        Magic magic = new Magic(120, 50);
        magic.applySuperAbility("");

        Warrior warrior = new Warrior(150, 30);
        warrior.applySuperAbility("");

        Hero[] array = {medic, magic, warrior};
        System.out.println(array);

        for(Hero i : array) {
            System.out.println("Health: " + i.health + "\nDamage: " + i.damage);
            i.applySuperAbility("");
        }

    }
    

}
