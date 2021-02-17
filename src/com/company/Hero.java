package com.company;

public abstract class Hero implements HavingSuperAbility{
        int health;
        int damage;

        public Hero(int health, int damage){
            this.health = health;
            this.damage = damage;
        }

    @Override
    public void applySuperAbility(String superAbilityType) {
    }
}
