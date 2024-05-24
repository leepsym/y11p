package map.room;

// Library Imports
import hostile.enemy.Skeleton; // Imports the Skeleton class from the hostile.enemy package
import item.weapons.RustedShortSword; // Imports the RustedShortSword class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room06 extends Room { // Initialises Room06 with Room as its superClass

    public Room06() {
        this.directions = new Room[6];
        this.directions[2] = new Room07();
        this.enemy = new Skeleton(16, 24, new RustedShortSword(null, 0, 0 ,0, 0));
        this.roomDescription = "Ancient weapon racks stand empty, their contents long pilfered. A faint draft slips through. The exit to the south offers a way to continue.";
    }
}