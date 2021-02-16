package com.company;

public class Medic extends Hero{
    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Медик применил ИСЦЕЛЕНИЕ РАН");
    }
}
