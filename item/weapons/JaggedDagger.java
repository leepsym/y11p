package item.weapons;

import item.Weapon;

public class JaggedDagger extends Weapon {
    public JaggedDagger(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) {
        this.name = (name != null ? name : "jagged dagger");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 20);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 3);
        this.damageType = "slashing";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 4);
        this.enemyAttackDescription = " swings a dagger at you!";
        this.playerAttackDescription = "You swing a dagger at the ";
    }
}