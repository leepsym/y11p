package main;

// Library Imports
import java.util.InputMismatchException; // Used to make sure that the given input is an integer
import java.util.Scanner; // Used to receive inputs from the user
import map.RoomChange; // Imports the RoomChange class from the map package
import map.room.*; // Imports all classes in the room package, in the map package
import item.weapons.*; // Imports all classes in the weapons package, in the item package

public class Main {
    Scanner scanner = new Scanner(System.in); // Initializes the scanner under the name scanner

    public static void main(String[] args) { // Method used to begin the game
        Main main = new Main(); // Initializes the Main class for use in the static method main
        main.initiate(); // Calls the initiate method from the Main class
    }

    public void initiate() { // Initialises the game
        System.out.println("Hello adventurer.");
        System.out.println("Welcome to the dungeon!");
        System.out.println();
        loadOut(false);
    }

    public void loadOut(boolean stringCaught) {
        System.out.println(); // Requests the kit the player would like to use
        System.out.println("What kit would you like? (enter the number)");
        System.out.println("1. Warrior");
        System.out.println("2. Archer");
        System.out.println();
        int kitChoice = 0; // Initialises the kitChoice integer
        if (stringCaught) {
            scanner.nextLine(); // Catch the input and void it
        }
        try {
            kitChoice = scanner.nextInt(); // Ask te user for the kit being used
        } catch (InputMismatchException e) { // Catch if the user inputs something other than an integer
            System.out.println("Integer Only. . .");
            loadOut(true); // Retry the request for the loadOut choice
        }
        switch (kitChoice) {
            case 1 -> { // If user inputs '1', give them these items
                System.out.println("You chose the Warrior kit!");
                System.out.println();
                Player.weapons[0] = new IronSword(null, 0, 0, 0, 0);
                Player.weapons[1] = new IronSpear(null, 0, 0, 0, 0);

            }
            case 2 -> { // If user inputs '2', give them these items
                System.out.println("You chose the Archer kit!");
                System.out.println();
                Player.weapons[0] = new Longbow(null, 0, 0, 0, 0);
                Player.weapons[1] = new HuntingKnife(null, 0, 0, 0, 0);
            }
            default -> { // If the user inputs anything other than '1' or '2', retry the request for the loadOut choice
                System.out.println("Invalid kit.");
                loadOut(true);
            }
        }
        System.out.println("You wake up in a cave, dizzy, and with no memories. . .");
        RoomChange.enterRoom(new Room01(), new Room01());
    }
}