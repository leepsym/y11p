package map.room;

// Library Imports
import hostile.enemy.Skeleton; // Imports the Skeleton class from the hostile.enemy package
import item.weapons.ShortBow; // Imports the ShortBow class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room08 extends Room { // Initialises Room08 with Room as its superClass

    public Room08() {
        this.directions = new Room[6];
        this.directions[1] = new Room09();
        this.enemy = new Skeleton(20, 12, new ShortBow(null, 0, 0 ,0, 0));
        this.roomDescription = "Broken pottery shards litter the floor, telling stories of a long-lost civilization. The room feels eerie. A path to the east promises new discoveries.";
    }
}