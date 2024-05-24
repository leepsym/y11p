package map.room;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room
import hostile.enemy.Goblin; // Imports the Goblin class from the hostile.enemy package
import item.weapons.IronSpear; // Imports the IronSpear class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room05 extends Room { // Initialises Room05 with Room as its superClass
    private static Enemy enemy;
    private static Room[] directions;
    public Room05() {
        directions = new Room[6];
        directions[1] = new Room06();
        directions[2] = new Room04();
        enemy = new Goblin(14, 20, new IronSpear(null, 0, 0 ,0, 0));
        this.roomDescription = "The chamber hums with the faint sound of dripping water. Stalactites hang precariously from the ceiling. Exits to the south and east suggest movement away from this damp enclave.";
    }
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        Room05.enemy = enemy;
    }

    public Room[] getDirections() {
        return directions;
    }
}
