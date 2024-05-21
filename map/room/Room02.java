package map.room;

// Library Imports
import hostile.enemy.Goblin; // Imports the Goblin class from the hostile.enemy package
import item.weapons.Stick; // Imports the Stick class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room

public class Room02 extends Room {

    public Room02() {
        this.directions = new Room[6];
        this.directions[2] = new Room03();
        this.enemy = new Goblin(10, 0, new Stick(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> south";
    }
}
