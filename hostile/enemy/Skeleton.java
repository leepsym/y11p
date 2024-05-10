package hostile.enemy;

import item.Weapon;
import hostile.Enemy;

public class Skeleton extends Enemy {
    public Skeleton(int health, int naturalArmour, Weapon weapon){
        this.name = "Skeleton";
        this.health = health;
        this.naturalArmour = naturalArmour;
        this.weapon = weapon;
    }
}