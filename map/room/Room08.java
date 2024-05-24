package map.room;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room
import hostile.enemy.Skeleton; // Imports the Skeleton class from the hostile.enemy package
import item.weapons.ShortBow; // Imports the ShortBow class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room08 extends Room { // Initialises Room08 with Room as its superClass
    private static Enemy enemy;
    private static Room[] directions;
    public Room08() {
        directions = new Room[6];
        directions[1] = new Room09();
        directions[3] = new Room07();
        enemy = new Skeleton(20, 12, new ShortBow(null, 0, 0 ,0, 0));
        this.roomDescription = "Broken pottery shards litter the floor, telling stories of a long-lost civilization. The room feels eerie. Paths to the west and east promise new discoveries.";
    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        Room08.enemy = enemy;
    }

    public Room[] getDirections() {
        return directions;
    }
}
