package item;

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
        input.nextLine();
        if (modChoice != 4) {
            System.out.println("Would you like to increase or decrease this statistic? (increase/decrease)");
            String increaseInput = input.nextLine();

            if (increaseInput.equals("increase")) {
                System.out.println("You have "+points+" points.");

                switch (modChoice) {
                    case 1:
                        System.out.println("You can turn 0.25 points into +1 to your hitChance.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 0.25;
                            input.nextLine();

                            if (points >= (amount)) {
                                points -= amount;
                                weapon.hitBonus += (int) (amount / 0.25);
                                continueModifying(weapon, weaponPlace);
                            } else {
                                System.out.println("You don't have enough points to do that! Remove some value from another statistic first.");
                                continueModifying(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                continueModifying(weapon, weaponPlace);
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
                            input.nextLine();

                            if (points >= (amount)) {
                                points -= amount;
                                weapon.baseDamage += (int) (amount / 2);
                            } else {
                                System.out.println("You don't have enough points to do that! Remove some value from another statistic first.");
                                continueModifying(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                continueModifying(weapon, weaponPlace);
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
                            input.nextLine();

                            if (points >= (amount)) {
                                points -= amount;
                                weapon.hitBonus += (int) (amount / 1.5);
                            } else {
                                System.out.println("You don't have enough points to do that! Remove some value from another statistic first.");
                                continueModifying(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                continueModifying(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        continueModifying(weapon, weaponPlace);
                }

            } else if (increaseInput.equals("decrease")){
                switch (modChoice) {
                    case 1:
                        System.out.println("Your current Hit Chance is "+weapon.hitBonus+".");
                        System.out.println("You can turn -1 from your Hit Chance into +0.25 to your points.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 0.25;
                            input.nextLine();

                            if (weapon.hitBonus >= (amount / 0.25)) {
                                weapon.hitBonus -= amount / 0.25;
                                points += (int) (amount);
                                
                            } else {
                                System.out.println("You don't have enough Hit Chance to do that!");
                                continueModifying(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                continueModifying(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Your current Damage is "+weapon.baseDamage+".");
                        System.out.println("You can turn -1 from your Damage into +2 to your points.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 2;
                            input.nextLine();

                            if (weapon.baseDamage >= (amount / 2)) {
                                weapon.baseDamage -= (int) (amount / 2);
                                points += (int) (amount);
                            } else {
                                System.out.println("You don't have enough Damage to do that!");
                                continueModifying(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                continueModifying(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("You currently have "+weapon.damageDiceSides+" sides on your Damage Dice");
                        System.out.println("You can turn -1 side from your Damage Dice into +1.5 to your points.");
                        System.out.println();
                        System.out.println("Would you like to proceed with this? (true/false)");

                        if (input.nextBoolean()) {
                            System.out.println("How many times would you like to do this?");
                            double amount = input.nextInt() * 1.5;
                            input.nextLine();

                            if (weapon.damageDiceSides >= (amount / 1.5)) {
                                weapon.damageDiceSides -= (int) (amount / 1.5);
                                points += (int) (amount);
                            } else {
                                System.out.println("You don't have enough sides to do that!");
                                continueModifying(weapon, weaponPlace);
                            }
                        } else {
                            System.out.println("Would you like to continue modifying?");

                            if (input.nextBoolean()){
                                continueModifying(weapon, weaponPlace);
                            } else {
                                Player.weapons[weaponPlace] = weapon;
                                game.playerAction();
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        continueModifying(weapon, weaponPlace);
                }
            } else {
                System.out.println("Invalid choice");
                continueModifying(weapon, weaponPlace);
            }
        } else {
            System.out.println("What would you like to change the weapon's name to?");
            weapon.name = input.nextLine();
            continueModifying(weapon, weaponPlace);
        }
        
    }
    public static void continueModifying(Weapon weapon, int weaponPlace){
        Scanner input = new Scanner(System.in);
        Game game = new Game();
        System.out.println("Would you like to continue modifying? (y/n)");
        String modify = input.nextLine();
        if (modify.equals("y")){
            continueModifying(weapon, weaponPlace);
        } else if (modify.equals("n")){
            Player.weapons[weaponPlace] = weapon;
            game.playerAction();
        } else {
            System.out.println("Invalid choice, please enter 'y' or 'n'.");
            continueModifying(weapon, weaponPlace);
        }
    }
}
