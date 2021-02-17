package com.company;

public class Magic extends Hero{
    public Magic(int health, int damage) {
        super(health, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Маг применил ОГНЕННЫЙ ШАР");
    }
}
