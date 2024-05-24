package map.room;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room
import hostile.enemy.Skeleton; // Imports the Skeleton class from the hostile.enemy package
import item.weapons.RustedShortSword; // Imports the RustedShortSword class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room06 extends Room { // Initialises Room06 with Room as its superClass
    private static Enemy enemy;
    private static Room[] directions;
    public Room06() {
        directions = new Room[6];
        directions[2] = new Room07();
        directions[3] = new Room05();
        enemy = new Skeleton(16, 24, new RustedShortSword(null, 0, 0 ,0, 0));
        this.roomDescription = "Ancient weapon racks stand empty, their contents long pilfered. A faint draft slips through. Exits to the west and south offer a way to continue.";
    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        Room06.enemy = enemy;
    }

    public Room[] getDirections() {
        return directions;
    }
}
