package map.room;

// Library Imports
import hostile.enemy.Orc; // Imports the Orc class from the hostile.enemy package
import item.weapons.IronSword; // Imports the IronSword class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room07 extends Room { // Initialises Room01 with Room as its superClass

    public Room07() {
        this.directions = new Room[6];
        this.directions[1] = new Room08();
        this.enemy = new Orc(16, 30, new IronSword(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> east";
    }
}
