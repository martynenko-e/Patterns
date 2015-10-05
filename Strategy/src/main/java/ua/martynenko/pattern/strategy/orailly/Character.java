package ua.martynenko.pattern.strategy.orailly;

/**
 * Created by cleri on 22.09.2015.
 */
public abstract class Character {
    WeaponBehavior weaponBehavior = new KnifeBehavior();

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior wb) {
        weaponBehavior = wb;
    }
}
