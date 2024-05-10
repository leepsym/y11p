package hostile.enemy;

import item.Weapon;
import hostile.Enemy;

public class Orc extends Enemy {
    public Orc(int health, int naturalArmour, Weapon weapon){
        this.name = "Orc";
        this.health = health;
        this.naturalArmour = naturalArmour;
        this.weapon = weapon;
    }
}