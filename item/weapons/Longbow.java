package item.weapons;

// Library Imports
import item.Weapon; // Imports the Weapon class, for use as a superClass

public class Longbow extends Weapon { // Initialises the Stick class with Weapon as its superclass
    public Longbow(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) { // Creates a constructor for each new instance with the following parameters: name, hitBonus, baseDamage, bonusDamage, and damageDiceSides
        this.name = (name != null ? name : "longbow");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 22);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 5);
        this.damageType = "piercing";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 8);
        this.enemyAttackDescription = " shoots a bow at you!";
        this.playerAttackDescription = "You shoot a bow at the ";
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