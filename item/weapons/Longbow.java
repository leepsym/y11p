package item.weapons;

import item.Weapon;

public class Longbow extends Weapon {
    public Longbow(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) {
        this.name = (name != null ? name : "longbow");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 22);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 5);
        this.damageType = "piercing";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 8);
        this.enemyAttackDescription = " shoots a bow at you!";
        this.playerAttackDescription = "You shoot a bow at the ";
    }
}