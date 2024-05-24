
package map.room;

// Library Imports
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room01 extends Room { // Initialises Room01 with Room as its superClass

    public Room01() {
        this.directions = new Room[6];
        this.directions[1] = new Room02();
        this.enemy = null;
        this.roomDescription = "In the chamber, forgotten barrels stand silent. No bodies, just echoes of the past. An exit to the east invites further exploration.";
    }
}
