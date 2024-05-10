package main;

import java.util.InputMismatchException;
import java.util.Scanner;
import map.RoomChange;
import map.room.*;

import item.weapons.*;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.initiate();
    }

    public void initiate() {
        System.out.println("Hello adventurer.");
        System.out.println("What would you like to be called?");
        String userName = scanner.nextLine();
        System.out.println();
        System.out.println("Welcome, " + userName + ".");
        loadOut(false);
    }

    public void loadOut(boolean scannerIsSoJank) {
        RoomChange roomChange = new RoomChange();
        System.out.println();
        System.out.println("What kit would you like? (enter the number)");
        System.out.println("1. Warrior");
        System.out.println("2. Archer");
        System.out.println();
        int kitChoice = 0;
        if (scannerIsSoJank) {
            scanner.nextLine();
        }
        try {
            kitChoice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Integer Only. . .");
            loadOut(true);
        }
        switch (kitChoice) {
            case 1 -> {
                System.out.println("You chose the Warrior kit!");
                System.out.println();
                Player.weapons[0] = new IronSword(null, 0, 0, 0, 0);
                Player.weapons[1] = new IronSpear(null, 0, 0, 0, 0);

            }
            case 2 -> {
                System.out.println("You chose the Archer kit!");
                System.out.println();
                Player.weapons[0] = new Longbow(null, 0, 0, 0, 0);
                Player.weapons[1] = new HuntingKnife(null, 0, 0, 0, 0);
            }
            default -> {
                System.out.println("Invalid kit.");
                loadOut(true);
            }
        }
        System.out.println("You wake up in a cave, dizzy, and with no memories. . .");
        roomChange.enterRoom(new Room01(), new Room01());
    }

    public static void finish(){
        System.out.println();
        System.out.println("Thank you for playing!");
    }
}