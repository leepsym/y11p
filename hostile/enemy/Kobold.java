package hostile.enemy;

import item.Weapon;
import hostile.Enemy;

public class Kobold extends Enemy {
    public Kobold(int health, int naturalArmour, Weapon weapon){
        this.name = "Kobold";
        this.health = health;
        this.naturalArmour = naturalArmour;
        this.weapon = weapon;
    }
}