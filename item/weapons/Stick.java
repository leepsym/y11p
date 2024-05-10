package item.weapons;

import item.Weapon;

public class Stick extends Weapon {
    public Stick(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) {
        this.name = (name != null ? name : "stick");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 12);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 1);
        this.damageType = "bludgeoning";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 3);
        this.enemyAttackDescription = " swings a stick at you!";
        this.playerAttackDescription = "You swing a stick at the ";
    }
}