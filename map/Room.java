package map;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to be used as a reference for the enemy in the room

public class Room { // Creates a master class for all rooms
    public Room[] directions;
    public boolean workbench = false;
    public Enemy enemy;
    public String roomDescription;
}