package item.weapons;

import item.Weapon;

public class ShortBow extends Weapon {
    public ShortBow(String name, int hitBonus, int baseDamage, int bonusDamage, int damageDiceSides) {
        this.name = (name != null ? name : "short bow");
        this.hitBonus = (hitBonus != 0 ? hitBonus : 21);
        this.baseDamage = (baseDamage != 0 ? baseDamage : 4);
        this.damageType = "piercing";
        this.bonusDamage = bonusDamage;
        this.damageDiceSides = (damageDiceSides != 0 ? damageDiceSides : 6);
        this.enemyAttackDescription = " shoots a bow at you!";
        this.playerAttackDescription = "You shoot a bow at the ";
    }
}