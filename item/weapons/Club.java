package item.weapons;

// Library Imports
import item.Weapon; // Imports the Weapon class, for use as a superClass

public class Club extends Weapon { // Initialises the Stick class with Weapon as its superclass
    public Club(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) { // Creates a constructor for each new instance with the following parameters: name, hitBonus, baseDamage, bonusDamage, and damageDiceSides
        this.name = (name != null ? name : "club");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 17);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 4);
        this.damageType = "bludgeoning";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 6);
        this.enemyAttackDescription = " swings a club at you!";
        this.playerAttackDescription = "You swing a club at the ";
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