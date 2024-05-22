package map.room;

// Library Imports
import hostile.enemy.Troll; // Imports the Troll class from the hostile.enemy package
import item.weapons.Club; // Imports the Club class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room010 extends Room { // Initialises Room01 with Room as its superClass
    public Room010() {
        this.directions = new Room[6];
        this.enemy = new Troll(30, 40, new Club(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> null";
    }
}
