package map;

// Library Imports
import hostile.Enemy; // Imports the Enemy class from the hostile package to access instances of enemies
import hostile.Fight; // Imports the Fight class from the hostile package to engage enemies in battle
import main.Game; // Imports the Game class from the main package so that currentRoom may be reassigned

public class RoomChange {
    public static void enterRoom(Room currentRoom, Room nextRoom) { // Method for entering new rooms, parameters for the room the player is in and is attempting to enter
        Game game = new Game(); // Initialises the Game class for static use
        Fight fight = new Fight(); // Initialises the Fight class for static use
        Enemy nextEnemy = nextRoom.enemy; // Assigns nextEnemy to the enemy in the room the player is trying to enter
        Enemy currentEnemy = currentRoom.enemy; // Assigns currentEnemy to the enemy in the room the player is currently in

        if (currentEnemy != null) { // Checks if currentEnemy has a value
            System.out.println("You move towards the next room, but the " + currentEnemy.name + " charges in front of you and blocks the entrance!");
            fight.engage(); // Calls the engage method within an instance of the Fight class
        } else {
            System.out.println(nextRoom.roomDescription); // If there is no enemy in the room, prints the description of the next room
            Game.currentRoom = nextRoom; // Sets the currentRoom to the new room
            try { // Attempts code
                System.out.println("The enemy in this room is a " + nextEnemy.name + ".");
            } catch (NullPointerException e) { // If nextEnemy.name == null, ignores th error and prints a different line
                System.out.println("There is no enemy in this room.");
                System.out.println();
            }
        }
        game.playerAction(); // Signals for the player to take another turn
    }
}
