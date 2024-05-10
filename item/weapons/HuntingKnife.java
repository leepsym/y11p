package item.weapons;

import item.Weapon;

public class HuntingKnife extends Weapon {
    public HuntingKnife(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) {
        this.name = (name != null ? name : "hunting knife");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 20);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 3);
        this.damageType = "slashing";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 4);
        this.enemyAttackDescription = " swings a knife at you!";
        this.playerAttackDescription = "You swing a knife at the ";
    }
}