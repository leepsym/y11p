package map.room;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room
import hostile.enemy.Kobold; // Imports the Kobold class from the hostile.enemy package
import item.weapons.JaggedDagger; // Imports the JaggedDagger class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room04 extends Room { // Initialises Room04 with Room as its superClass
    private static Enemy enemy;
    private static Room[] directions;
    public Room04() {
        directions = new Room[6];
        directions[0] = new Room05();
        directions[3] = new Room03();
        enemy = new Kobold(9, 15, new JaggedDagger(null, 0, 0 ,0, 0));
        this.roomDescription = "A lone, broken chair lies in the corner, its wood rotting and splintered. The air is chill. Paths to the north and west offer a way out.";
    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        Room04.enemy = enemy;
    }

    public Room[] getDirections() {
        return directions;
    }
}
