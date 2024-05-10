package hostile.enemy;

import item.Weapon;
import hostile.Enemy;

public class Goblin extends Enemy {
    public Goblin(int health, int naturalArmour, Weapon weapon){
        this.name = "Goblin";
        this.health = health;
        this.naturalArmour = naturalArmour;
        this.weapon = weapon;
    }
}