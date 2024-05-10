package item.weapons;

import item.Weapon;

public class IronSword extends Weapon {
    public IronSword(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) {
        this.name = (name != null ? name : "iron sword");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 24);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 6);
        this.damageType = "slashing";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 8);
        this.enemyAttackDescription = " swings a sword at you!";
        this.playerAttackDescription = "You swing a sword at the ";
    }
}