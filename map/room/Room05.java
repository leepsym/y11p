package map.room;

// Library Imports
import hostile.enemy.Goblin; // Imports the Goblin class from the hostile.enemy package
import item.weapons.IronSpear; // Imports the IronSpear class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room05 extends Room { // Initialises Room05 with Room as its superClass

    public Room05() {
        this.directions = new Room[6];
        this.directions[1] = new Room06();
        this.enemy = new Goblin(14, 20, new IronSpear(null, 0, 0 ,0, 0));
        this.roomDescription = "The chamber hums with the faint sound of dripping water. Stalactites hang precariously from the ceiling. A small exit to the east suggests movement away from this damp enclave.";
    }
}