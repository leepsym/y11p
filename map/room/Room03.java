package map.room;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room
import hostile.enemy.Goblin; // Imports the Goblin class from the hostile.enemy package
import item.weapons.Stick; // Imports the Stick class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room03 extends Room { // Initialises Room03 with Room as its superClass
    private static Enemy enemy;
    private static Room[] directions;
    public Room03() {
        directions = new Room[6];
        directions[0] = new Room02();
        directions[1] = new Room04();
        enemy = new Goblin(12, 15, new Stick(null, 0, 0 ,0, 0));
        this.roomDescription = "Flickering torchlight reveals faded tapestries lining the walls. The floor is scattered with brittle parchment. Exits lead north and east, beckoning onward.";
    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        Room03.enemy = enemy;
    }

    public Room[] getDirections() {
        return directions;
    }
}
