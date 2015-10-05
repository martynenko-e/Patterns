package ua.martynenko.pattern.strategy.orailly;

/**
 * Created by cleri on 22.09.2015.
 */
public class Troll extends Character {
    @Override
    public void fight() {
        System.out.println("Troll fight");
        weaponBehavior.useWeapon();
    }
}
