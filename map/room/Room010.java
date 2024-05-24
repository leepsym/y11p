package map.room;

// Library Imports
import hostile.Enemy;
import hostile.enemy.Troll; // Imports the Troll class from the hostile.enemy package
import item.weapons.Club; // Imports the Club class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room010 extends Room { // Initialises Room010 with Room as its superClass
    private static Room[] directions;
    public Room010() {
        directions = new Room[6];
        directions[0] = new Room09();
        directions[4] = new Room101();
        directions[5] = new Room_101();
        this.roomDescription = "A spiral staircase descends into darkness, while a sturdy ladder ascends into the unknown. The air is filled with the scent of aged stone. An exit to the north, along with the ladder up and the staircase down, present a choice of direction.";
    }

    private Room[] getDirections() {
        return directions;
    }
}
