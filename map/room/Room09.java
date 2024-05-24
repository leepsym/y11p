package map.room;

// Library Imports
import hostile.enemy.Orc; // Imports the Orc class from the hostile.enemy package
import item.weapons.IronSword; // Imports the IronSword class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room09 extends Room { // Initialises Room09 with Room as its superClass

    public Room09() {
        this.directions = new Room[6];
        this.directions[1] = new Room010();
        this.enemy = new Orc(20, 35, new IronSword(null, 0, 0 ,0, 0));
        this.roomDescription = "Shadows dance across the walls, cast by unseen flames. The silence is oppressive. One last exit to the south provides a route of escape.";
    }
}