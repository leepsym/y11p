package main;

import hostile.Fight;
import map.*;
import map.room.*;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Fight fight = new Fight();
    public static Room currentRoom = new Room01();

    public void playerAction() {
        System.out.println("What would you like to do?");
        String playerChoice = scanner.nextLine().toLowerCase();
        System.out.println();
        String[] words = playerChoice.split("\\s+", 2);
        String firstWord = words[0];
        String restOfWords = "";
        String commandType;
        if (words.length > 1) {
            restOfWords = words[1];
        }
        switch (firstWord) {

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