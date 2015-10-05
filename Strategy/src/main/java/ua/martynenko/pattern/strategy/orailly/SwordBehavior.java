package ua.martynenko.pattern.strategy.orailly;

/**
 * Created by cleri on 22.09.2015.
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("using Sword");
    }
}
