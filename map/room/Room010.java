package map.room;

// Library Imports
import hostile.enemy.Troll; // Imports the Troll class from the hostile.enemy package
import item.weapons.Club; // Imports the Club class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room010 extends Room { // Initialises Room010 with Room as its superClass
    public Room010() {
        this.directions = new Room[6];
        this.enemy = new Troll(30, 40, new Club(null, 0, 0 ,0, 0));
        this.roomDescription = "A faint light seeps through a crack in the wall, accompanied by a small breeze that stirs the stale air. The scent of aged stone lingers. A way out to the north through the crack in the wall presents an escape from this lair";
    }
}