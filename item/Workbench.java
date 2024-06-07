package item;

import java.util.InputMismatchException; // For use in catching errors
import java.util.Scanner; // Imports the scanner module to receive inputs from the user
import main.Game; // Imports the Game class to refer the player back to the playerAction method
import main.Player; // Imports the Player class for use accessing weapons


public class Workbench {
    public static double points = 0; // Creates a static variable,which allows it to be referenced in static methods

    public static void modify(Weapon weapon, int weaponPlace) { // Creates a method with 2 parameters
        // Creates instance for static use
        Scanner input = new Scanner(System.in);

        String proceed; // Initialises a string for use over all of this method

        try { // Error catching system
            // Asks the player for the statistic they would like to customise
            System.out.println("What statistic would you like to increase/decrease? (enter the number)");
            System.out.println();
            System.out.println("1) Hit Chance");
            System.out.println("2) Natural Damage");
            System.out.println("3) Extra Damage Dice Sides");
            System.out.println("4) Change Name");
            int modChoice = input.nextInt(); // Logs the integer inputted
            input.nextLine(); // Eats up the rest of the input

            if (modChoice != 4) { // If the player isn't changing the name of the weapon
                System.out.println("Would you like to increase or decrease this statistic? (increase/decrease)");
                String increaseInput = input.nextLine(); // Logs the next line to a variable

                if (increaseInput.equals("increase")) { // Checks if the user inputted 'increase'
                    System.out.println("You have " + (int) points + " points."); // Informs the user of how many points they have, using (int) to safely change the double

                    switch (modChoice) {
                        case 1:
                            // Manages the basic user inputs, and gets them through the process of selection
                            System.out.println("You can turn 0.25 points into +1 to your hitChance.");
                            System.out.println();
                            System.out.println("Would you like to proceed with this? (y/n)");
                            proceed = input.nextLine();

                            if (proceed.equals("y")) {
                                System.out.println("How many times would you like to do this?");
                                double amount = input.nextInt() * 0.25; // Sets amount to how many points would be needed
                                input.nextLine();

                                if (points >= (amount)) { // Updates the player's points, and the weapon's bonuses, then informs them of their new values
                                    points -= amount;
                                    weapon.hitBonus += (int) (amount / 0.25);
                                    System.out.println("You now have " + (int) points + " points.");
                                    System.out.println("Your Hit Chance is now " + weapon.hitBonus + ".");
                                    continueModifying(weapon, weaponPlace);
                                } else { // If the player doesn't have enough points
                                    System.out.println("You don't have enough points to do that! Remove some value from another statistic first.");
                                    continueModifying(weapon, weaponPlace);
                                }
                            } else { // If the player doesn't want to continue down this path
                                continueModifying(weapon, weaponPlace);
                            }
                            break;
                        case 2:
                            // Manages the basic user inputs, and gets them through the process of selection
                            System.out.println("You can turn 2 points into +1 to your damage.");
                            System.out.println();
                            System.out.println("Would you like to proceed with this? (y/n)");
                            proceed = input.nextLine();

                            if (proceed.equals("y")) {
                                System.out.println("How many times would you like to do this?");
                                double amount = input.nextInt() * 2; // Sets amount to how many points would be needed
                                input.nextLine();

                                if (points >= (amount)) { // Updates the player's points, and the weapon's bonuses, then informs them of their new values
                                    points -= amount;
                                    weapon.baseDamage += (int) (amount / 2);
                                    System.out.println("You now have " + (int) points + " points.");
                                    System.out.println("Your damage is now " + weapon.baseDamage + ".");
                                    continueModifying(weapon, weaponPlace);
                                } else { // If the player doesn't have enough points
                                    System.out.println("You don't have enough points to do that! Remove some value from another statistic first.");
                                    continueModifying(weapon, weaponPlace);
                                }
                            } else { // If the player doesn't want to continue down this path
                                continueModifying(weapon, weaponPlace);
                            }
                            break;
                        case 3:
                            // Manages the basic user inputs, and gets them through the process of selection
                            System.out.println("You can turn 1.5 points into +1 to your damage dice sides.");
                            System.out.println();
                            System.out.println("Would you like to proceed with this? (y/n)");
                            proceed = input.nextLine();

                            if (proceed.equals("y")) {
                                System.out.println("How many times would you like to do this?");
                                double amount = input.nextInt() * 1.5; // Sets amount to how many points would be needed
                                input.nextLine();

                                if (points >= (amount)) { // Updates the player's points, and the weapon's bonuses, then informs them of their new values
                                    points -= amount;
                                    weapon.damageDiceSides += (int) (amount / 1.5);
                                    System.out.println("You now have " + (int) points + " points.");
                                    System.out.println("You now have " + weapon.damageDiceSides + " sides on your dice.");
                                    continueModifying(weapon, weaponPlace);
                                } else { // If the player doesn't have enough points
                                    System.out.println("You don't have enough points to do that! Remove some value from another statistic first.");
                                    continueModifying(weapon, weaponPlace);
                                }
                            } else { // If the player doesn't want to continue down this path
                                continueModifying(weapon, weaponPlace);
                            }
                            break;
                        default:
                            System.out.println("Invalid choice");
                            continueModifying(weapon, weaponPlace);
                    }

                } else if (increaseInput.equals("decrease")) {
                    switch (modChoice) {
                        case 1:
                            // Manages the basic user inputs, and gets them through the process of selection
                            System.out.println("Your current Hit Chance is " + weapon.hitBonus + ".");
                            System.out.println("You can turn -1 from your Hit Chance into +0.25 to your points.");
                            System.out.println();
                            System.out.println("Would you like to proceed with this? (y/n)");
                            proceed = input.nextLine();

                            if (proceed.equals("y")) {
                                System.out.println("How many times would you like to do this?");
                                double amount = input.nextInt() * 0.25; // Sets amount to how many points would be gained
                                input.nextLine();

                                if (weapon.hitBonus >= (amount / 0.25)) { // Updates the player's points, and the weapon's bonuses, then informs them of their new values
                                    weapon.hitBonus -= amount / 0.25;
                                    points += (int) (amount);
                                    System.out.println("You now have " + (int) points + " points.");
                                    System.out.println("Your damage is now " + weapon.hitBonus + ".");
                                    continueModifying(weapon, weaponPlace);
                                } else { // If the player doesn't have enough value in that statistic
                                    System.out.println("You don't have enough Hit Chance to do that!");
                                    continueModifying(weapon, weaponPlace);
                                }
                            } else { // If the player doesn't want to continue down this path
                                continueModifying(weapon, weaponPlace);
                            }
                            break;
                        case 2:
                            // Manages the basic user inputs, and gets them through the process of selection
                            System.out.println("Your current Damage is " + weapon.baseDamage + ".");
                            System.out.println("You can turn -1 from your Damage into +2 to your points.");
                            System.out.println();
                            System.out.println("Would you like to proceed with this? (y/n)");
                            proceed = input.nextLine();

                            if (proceed.equals("y")) {
                                System.out.println("How many times would you like to do this?");
                                double amount = input.nextInt() * 2; // Sets amount to how many points would be gained
                                input.nextLine();

                                if (weapon.baseDamage >= (amount / 2)) { // Updates the player's points, and the weapon's bonuses, then informs them of their new values
                                    weapon.baseDamage -= (int) (amount / 2);
                                    points += (int) (amount);
                                    System.out.println("You now have " + (int) points + " points.");
                                    System.out.println("Your damage is now " + weapon.baseDamage + ".");
                                    continueModifying(weapon, weaponPlace);
                                } else { // If the player doesn't have enough value in that statistic
                                    System.out.println("You don't have enough Damage to do that!");
                                    continueModifying(weapon, weaponPlace);
                                }
                            } else { // If the player doesn't want to continue down this path
                                continueModifying(weapon, weaponPlace);
                            }
                            break;
                        case 3:
                            // Manages the basic user inputs, and gets them through the process of selection
                            System.out.println("You currently have " + weapon.damageDiceSides + " sides on your Damage Dice");
                            System.out.println("You can turn -1 side from your Damage Dice into +1.5 to your points.");
                            System.out.println();
                            System.out.println("Would you like to proceed with this? (y/n)");
                            proceed = input.nextLine();

                            if (proceed.equals("y")) {
                                System.out.println("How many times would you like to do this?");
                                double amount = input.nextInt() * 1.5; // Sets amount to how many points would be gained
                                input.nextLine();

                                if (weapon.damageDiceSides >= (amount / 1.5)) { // Updates the player's points, and the weapon's bonuses, then informs them of their new values
                                    weapon.damageDiceSides -= (int) (amount / 1.5);
                                    points += (int) (amount);
                                    System.out.println("You now have " + (int) points + " points.");
                                    System.out.println("You now have " + weapon.damageDiceSides + " sides on your dice.");
                                    continueModifying(weapon, weaponPlace);
                                } else { // If the player doesn't have enough value in that statistic
                                    System.out.println("You don't have enough sides to do that!");
                                    continueModifying(weapon, weaponPlace);
                                }
                            } else { // If the player doesn't want to continue down this path
                                continueModifying(weapon, weaponPlace);
                            }
                            break;
                        default: // If the player inputs something unexpected
                            System.out.println("Invalid choice");
                            continueModifying(weapon, weaponPlace);
                    }
                } else { // If the player inputs something unexpected
                    System.out.println("Invalid choice");
                    continueModifying(weapon, weaponPlace);
                }
            } else { // If the player enters 4, to change the weapons name
                System.out.println("What would you like to change the weapon's name to?");
                weapon.name = input.nextLine(); // Records the users next input
                continueModifying(weapon, weaponPlace);
            }
        } catch (InputMismatchException e) { // If the player enters something other than an acceptable input
            System.out.println("Invalid input. Please enter a valid number or boolean value.");
            input.nextLine();
            modify(weapon, weaponPlace);
        } catch (Exception e) { // If any other error occurs, don't break the game, just log it to the terminal.
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            input.close(); // Remove the input
        }
    }

    public static void continueModifying(Weapon weapon, int weaponPlace) { // Used in checking if the player wants to continue with the modification process
        // Creates instance for static use
        Scanner input = new Scanner(System.in);
        Game game = new Game();

        // Manage base user inputs
        System.out.println("Would you like to continue modifying? (y/n)");
        String modify = input.nextLine();
        // If the user does want to continue modifying, direct them back to the base questionnaire
        if (modify.equals("y")) {
            modify(weapon, weaponPlace);
        } else if (modify.equals("n")) { // If the player doesn't want to continue, tell them their next exit and give them their playerAction
            Player.weapons[weaponPlace] = weapon;
            if (Game.currentRoom.directions[0] != null) {
                System.out.println("You have an exit to the north.");
            } else if (Game.currentRoom.directions[1] != null) {
                System.out.println("You have an exit to the east.");
            } else if (Game.currentRoom.directions[2] != null) {
                System.out.println("You have an exit to the south.");
            } else if (Game.currentRoom.directions[3] != null) {
                System.out.println("You have an exit to the west.");
            }
            game.playerAction();
        } else { // If the user inputs something unexpected, ask for another input
            System.out.println("Invalid choice, please enter 'y' or 'n'.");
            continueModifying(weapon, weaponPlace);
        }
    }
}