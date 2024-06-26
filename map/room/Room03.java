package map.room;

// Library Imports
import hostile.enemy.Goblin; // Imports the Goblin class from the hostile.enemy package
import item.weapons.Stick; // Imports the Stick class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room03 extends Room { // Initialises Room03 with Room as its superClass

    public Room03() {
        this.directions = new Room[6];
        this.directions[1] = new Room04();
        this.enemy = new Goblin(12, 15, new Stick(null, 0, 0 ,0, 0));
        this.roomDescription = "Flickering torchlight reveals faded tapestries lining the walls. The floor is scattered with brittle parchment. An exit leads east, beckoning onward.";
    }
}