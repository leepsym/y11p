package map.room;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room
import hostile.enemy.Orc; // Imports the Orc class from the hostile.enemy package
import item.weapons.IronSword; // Imports the IronSword class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room07 extends Room { // Initialises Room07 with Room as its superClass
    private static Enemy enemy;
    private static Room[] directions;
    public Room07() {
        directions = new Room[6];
        directions[0] = new Room06();
        directions[1] = new Room08();
        enemy = new Orc(16, 30, new IronSword(null, 0, 0 ,0, 0));
        this.roomDescription = "Cobwebs cover every corner, and the musty smell of decay permeates the air. Exits to the north and east hint at fresh air beyond.";
    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        Room07.enemy = enemy;
    }

    public Room[] getDirections() {
        return directions;
    }
}