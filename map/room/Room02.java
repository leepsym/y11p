package map.room;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room
import hostile.enemy.Goblin; // Imports the Goblin class from the hostile.enemy package
import item.weapons.Stick; // Imports the Stick class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room02 extends Room { // Initialises Room02 with Room as its superClass
    private static Enemy enemy;
    private static Room[] directions;
    public Room02() {
        directions = new Room[6];
        directions[2] = new Room03();
        directions[3] = new Room01();
        enemy = new Goblin(10, 0, new Stick(null, 0, 0 ,0, 0));
        this.roomDescription = "Dust swirls in the dim light, settling on old crates. The air is thick with the scent of mildew. Exits to the south and west promise escape from this stagnant room.";
    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        Room02.enemy = enemy;
    }

    public Room[] getDirections() {
        return directions;
    }
}
