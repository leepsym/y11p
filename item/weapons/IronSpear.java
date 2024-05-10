package item.weapons;

import item.Weapon;

public class IronSpear extends Weapon {
    public IronSpear(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) {
        this.name = (name != null ? name : "iron spear");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 22);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 5);
        this.damageType = "piercing";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 6);
        this.enemyAttackDescription = " jabs a spear at you!";
        this.playerAttackDescription = "You jab a spear at the ";
    }
}