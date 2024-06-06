package item;

import java.util.Objects; // Imports the object module for use as a placeholder
import java.util.Scanner; // Imports the scanner module to receive inputs from the user
import main.Game; // Imports the Game class to refer the player back to the playerAction method
import main.Player;

public class Workbench {
    public static double points = 0;
    public static void modify(Weapon weapon, int weaponPlace){
        Scanner input = new Scanner(System.in); // Initialising the scanner in a static way, to be used later
        Game game = new Game();

        System.out.println("What statistic would you like to increase/decrease? (enter the number)");
        System.out.println();
        System.out.println("1) Hit Chance");
        System.out.println("2) Natural Damage");
        System.out.println("3) Extra Damage Dice Sides");
        System.out.println("4) Change Name");
        int modChoice = input.nextInt();
        if (modChoice != 4) {
            System.out.println("Would you like to increase or decrease this statistic? (inc/dec)");
            boolean increase = ((Objects.equals(input.nextLine(), "inc")));

            if (increase) {
                System.out.println("You have "+points+" points.");

                switch (modChoice) {
                    case 1:
                        System.out.println("You can turn 0.25 points into +1 to your hitChance.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 0.25;

                            if (points >= (amount)) {
                                points -= amount;
                                weapon.hitBonus += (int) (amount / 0.25);
                            } else {
                                System.out.println("You don't have enough points to do that! Remove some value from another statistic first.");
                                modify(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                modify(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("You can turn 2 points into +1 to your damage.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 2;

                            if (points >= (amount)) {
                                points -= amount;
                                weapon.hitBonus += (int) (amount / 2);
                            } else {
                                System.out.println("You don't have enough points to do that! Remove some value from another statistic first.");
                                modify(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                modify(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("You can turn 0.25 points into +1 to your hitChance.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 1.5;

                            if (points >= (amount)) {
                                points -= amount;
                                weapon.hitBonus += (int) (amount / 1.5);
                            } else {
                                System.out.println("You don't have enough points to do that! Remove some value from another statistic first.");
                                modify(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                modify(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        modify(weapon, weaponPlace);
                }

            } else {
                double value;
                switch (modChoice) {
                    case 1:
                        value = weapon.hitBonus;
                        System.out.println("Your current Hit Chance is "+value+".");
                        System.out.println("You can turn -1 from your Hit Chance into +0.25 to your points.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 0.25;

                            if (value >= (amount)) {
                                value -= amount;
                                points += (int) (amount / 0.25);
                            } else {
                                System.out.println("You don't have enough Hit Chance to do that!");
                                modify(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                modify(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    case 2:
                        value = weapon.baseDamage;
                        System.out.println("Your current Damage is "+value+".");
                        System.out.println("You can turn -1 from your Damage into +2 to your points.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 2;

                            if (value >= (amount)) {
                                value -= amount;
                                points += (int) (amount / 2);
                            } else {
                                System.out.println("You don't have enough Damage to do that!");
                                modify(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                modify(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    case 3:
                        value = weapon.damageDiceSides;
                        System.out.println("You currently have "+value+" sides on your Damage Dice");
                        System.out.println("You can turn -1 side from your Damage Dice into +1.5 to your points.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 1.5;

                            if (value >= (amount)) {
                                value -= amount;
                                points += (int) (amount / 1.5);
                            } else {
                                System.out.println("You don't have enough sides to do that!");
                                modify(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                modify(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        modify(weapon, weaponPlace);
                }
            }
        } else {
            System.out.println("What would you like to change the weapon's name to?");
            weapon.name = input.nextLine();
            modify(weapon, weaponPlace);
        }

    }
}