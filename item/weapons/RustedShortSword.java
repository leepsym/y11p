package item.weapons;

import item.Weapon;

public class RustedShortSword extends Weapon {
    public RustedShortSword(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) {
        this.name = (name != null ? name : "rusted short sword");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 21);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 4);
        this.damageType = "slashing";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 6);
        this.enemyAttackDescription = " swings a sword at you!";
        this.playerAttackDescription = "You swing a sword at the ";
    }
}