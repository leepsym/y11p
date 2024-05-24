package map.room;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room01 extends Room { // Initialises Room01 with Room as its superClass
    private static Enemy enemy;
    private static Room[] directions;
    public Room01() {
        directions = new Room[6];
        directions[1] = new Room02();
        enemy = null;
        this.roomDescription = "In the chamber, forgotten barrels stand silent. No bodies, just echoes of the past. An exit to the east invites further exploration.";
    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        Room01.enemy = enemy;
    }

    public Room[] getDirections() {
        return directions;
    }
}