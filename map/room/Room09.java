package map.room;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room
import hostile.enemy.Troll; // Imports the Orc class from the hostile.enemy package
import item.weapons.Club; // Imports the IronSword class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room09 extends Room { // Initialises Room09 with Room as its superClass
    private static Enemy enemy;
    private static Room[] directions;
    public Room09() {
        directions = new Room[6];
        directions[1] = new Room010();
        directions[3] = new Room08();
        enemy = new Troll(30, 40, new Club(null, 0, 0 ,0, 0));
        this.roomDescription = "Shadows dance across the walls, cast by unseen flames. The silence is oppressive. Exits to the west and south provide routes of escape";
    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        Room09.enemy = enemy;
    }

    public Room[] getDirections() {
        return directions;
    }
}
