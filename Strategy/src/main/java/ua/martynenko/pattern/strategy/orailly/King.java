package ua.martynenko.pattern.strategy.orailly;

/**
 * Created by cleri on 22.09.2015.
 */
public class King extends Character {
    @Override
    public void fight() {
        System.out.println("King fight");
        weaponBehavior.useWeapon();
    }
}
