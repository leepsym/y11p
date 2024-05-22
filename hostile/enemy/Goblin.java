package hostile.enemy;

// Import Library
import item.Weapon; // Imports the Weapon class from the item library to use in the constructor
import hostile.Enemy; // Imports the Enemy class from the hostile package to use as a superClass

public class Goblin extends Enemy { // Initialises the Goblin class with the superClass of Enemy
    public Goblin(int health, int naturalArmour, Weapon weapon){ // Creates a constructor with the following parameters: health, naturalArmour, and weapon
        this.name = "Goblin";
        this.health = health;
        this.naturalArmour = naturalArmour;
        this.weapon = weapon;
    }
}