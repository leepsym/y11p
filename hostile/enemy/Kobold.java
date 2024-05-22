package hostile.enemy;

// Import Library
import item.Weapon; // Imports the Weapon class from the item library to use in the constructor
import hostile.Enemy; // Imports the Enemy class from the hostile package to use as a superClass

public class Kobold extends Enemy { // Initialises the Kobold class with the superClass of Enemy
    public Kobold(int health, int naturalArmour, Weapon weapon){ // Creates a constructor with the following parameters: health, naturalArmour, and weapon
        this.name = "Kobold";
        this.health = health;
        this.naturalArmour = naturalArmour;
        this.weapon = weapon;
    }
}