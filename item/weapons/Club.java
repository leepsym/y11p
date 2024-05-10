package item.weapons;

import item.Weapon;

public class Club extends Weapon {
    public Club(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) {
        this.name = (name != null ? name : "club");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 17);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 4);
        this.damageType = "bludgeoning";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 6);
        this.enemyAttackDescription = " swings a club at you!";
        this.playerAttackDescription = "You swing a club at the ";
    }
}