package hostile.enemy;

import item.Weapon;
import hostile.Enemy;

public class Troll extends Enemy{
    public Troll(int health, int naturalArmour, Weapon weapon){
        this.name = "Troll";
        this.health = health;
        this.naturalArmour = naturalArmour;
        this.weapon = weapon;
    }
}