package map;

import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room

public class Room { // Creates a master class for all rooms
    public Room[] directions;
    public String roomDescription;
    private static Enemy enemy;
    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        enemy = enemy;
    }
}
