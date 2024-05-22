package item.weapons;

// Library Imports
import item.Weapon; // Imports the Weapon class, for use as a superClass

public class Stick extends Weapon { // Initialises the Stick class with Weapon as its superclass
    public Stick(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) { // Creates a constructor for each new instance with the following parameters: name, hitBonus, baseDamage, bonusDamage, and damageDiceSides
        this.name = (name != null ? name : "stick");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 12);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 1);
        this.damageType = "bludgeoning";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 3);
        this.enemyAttackDescription = " swings a stick at you!";
        this.playerAttackDescription = "You swing a stick at the ";
        /*
        For the following variables, a conditional operator checks whether a special value has been set as the value.
        If it hasn't it sets it to the default values for the weapon.
        Variables:
        name,
        hitBonus,
        baseDamage,
        damageDiceSides
         */
    }
}