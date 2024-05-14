package main;

// Library Imports
import hostile.Fight; // Used to allow the player to fight an enemy in their current room
import map.*; // Used to reference the Room and RoomChange classes
import map.room.Room01; // Used to import the currentRoom variable
import java.util.Scanner; // Used to import the scanner which is used to receive inputs from the user

public class Game {
    Scanner scanner = new Scanner(System.in); // Initializes the scanner
    Fight fight = new Fight(); // Creates an instance of the Fight class
    public static Room currentRoom = new Room01(); // Creates a static variable that stores

    public void playerAction() { // Used for letting the player take an action
        System.out.println("What would you like to do?");
        String playerChoice = scanner.nextLine().toLowerCase(); // Gets a lower case version of an input from the player
        System.out.println();
        String[] words = playerChoice.split("\\s+", 2); // Separates the input from the user into an array with an index for each word
        String firstWord = words[0]; // Sets the first word in the array to the first word inputted
        String restOfWords = ""; // Creates the String restOfWords, already initialised
        String commandType; // Creates the string commandType, to be used later, in the case of the user inputting 'help'
        try { // Attempts to set restOfWords' to the second item in the array 'words'
            restOfWords = words[1];
        } catch (NullPointerException _){} // If the slot [1] of the 'words' array is null, ignores the error
        switch (firstWord) { // Gives different outputs based on what the first word that the user entered is

            // Utility Commands

            // Help - 
            case "help":
                System.out.println("What type of command are you looking for? (enter the number)");
                System.out.println();
                System.out.println("1) General commands");
                System.out.println("2) Utility commands");
                commandType = scanner.nextLine();
                switch (commandType) {
                    case "1" -> {
                        System.out.println("Available commands:");
                        System.out.println();
                        System.out.println("move (direction)");
                        System.out.println("fight (enemy)");
                    }
                    case "2" -> {
                        System.out.println("Available commands:");
                        System.out.println();
                        System.out.println("exit");
                    }
                    default -> System.out.println("Invalid option.");
                }
                playerAction();
                break;

            // Exit - The player exits the game.
            case "exit":
                break;

            // General Commands

            // Move - The player moves in any direction that has an accessible entrance.
            case "move":
                switch (restOfWords.toLowerCase()) {
                    case "north":
                        if (currentRoom.directions[0] != null) {
                            System.out.println("You move north.");
                            RoomChange.enterRoom(currentRoom, currentRoom.directions[0]);
                        }else {
                            System.out.println("Invalid option.");
                            playerAction();
                        }
                        break;
                    case "east":
                        if (currentRoom.directions[1] != null) {
                            System.out.println("You move east.");
                            RoomChange.enterRoom(currentRoom, currentRoom.directions[1]);
                        }else {
                            System.out.println("Invalid option.");
                            playerAction();
                        }
                        break;
                    case "south":
                        if (currentRoom.directions[2] != null) {
                            System.out.println("You move south.");
                            RoomChange.enterRoom(currentRoom, currentRoom.directions[2]);
                        }else {
                            System.out.println("Invalid option.");
                            playerAction();
                        }
                        break;
                    case "west":
                        if (currentRoom.directions[3] != null) {
                            System.out.println("You move west.");
                            RoomChange.enterRoom(currentRoom, currentRoom.directions[3]);
                        }else {
                            System.out.println("Invalid option.");
                            playerAction();
                        }
                        break;
                    default:
                        System.out.println("Invalid option.");
                        playerAction();
                        break;
                }
                break;

            // Fight - The player fights an enemy that is occupying the room they are in.
            case "fight":
                if (currentRoom.enemy != null) {
                    fight.engage();
                } else {
                    System.out.println("There are no enemies in this room!");
                    playerAction();
                }
                break;

            // Default - If the player inputs an invalid option.
            default:
                System.out.println("Invalid action.");
                playerAction();
                break;
        }
    }
}