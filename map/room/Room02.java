package map.room;

// Library Imports
import hostile.enemy.Goblin; // Imports the Goblin class from the hostile.enemy package
import item.weapons.Stick; // Imports the Stick class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room02 extends Room { // Initialises Room02 with Room as its superClass

    public Room02() {
        this.directions = new Room[6];
        this.directions[2] = new Room03();
        this.enemy = new Goblin(10, 0, new Stick(null, 0, 0 ,0, 0));
        this.roomDescription = "Dust swirls in the dim light, settling on old crates. The air is thick with the scent of mildew. An exit to the south promises escape from this stagnant room.";
    }
}