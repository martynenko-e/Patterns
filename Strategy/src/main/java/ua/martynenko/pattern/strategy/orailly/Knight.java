package ua.martynenko.pattern.strategy.orailly;

/**
 * Created by cleri on 22.09.2015.
 */
public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println("Knight fight");
        weaponBehavior.useWeapon();
    }
}
