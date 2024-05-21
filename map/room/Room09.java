package map.room;

// Library Imports
import hostile.enemy.Orc; // Imports the Orc class from the hostile.enemy package
import item.weapons.IronSword; // Imports the IronSword class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room

public class Room09 extends Room {

    public Room09() {
        this.directions = new Room[6];
        this.directions[1] = new Room010();
        this.enemy = new Orc(20, 35, new IronSword(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> east";
    }
}
