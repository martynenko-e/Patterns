package ua.martynenko.pattern.strategy.orailly;

/**
 * Created by cleri on 22.09.2015.
 */
public class CharacterMain {
    public static void main(String[] args) {
        King king = new King();
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
    }
}
