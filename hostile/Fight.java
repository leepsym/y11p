package hostile;

// Library Imports
import item.Weapon; // Imports the Weapon class from the item package to reference all classes using it as a superClass
import main.*; // Imports all classes from the main package for use
import map.Room; // Imports the Room class from the map package to reference all classes using it as a superClass
import java.util.Scanner; // Imports the Scanner module to receive inputs from the user
import java.util.Random; // Imports the Random module to generate random numbers

public class Fight {
    Scanner scanner = new Scanner(System.in); // Initialises the Scanner module for use
    Random random = new Random(); // Initialises the Random module for use

    public void engage() { // Used for initialising battles between the player and enemies
        Enemy enemy = Game.currentRoom.enemy; // Sets the enemy variable to the current enemy in the room
        if ("aeiouAEIOU".indexOf(enemy.name.charAt(0)) != -1) { // Checks if the enemy's name begins with a vowel
            System.out.println("You are now fighting a " + enemy.name + "!");
        } else { // Making sure correct grammar is used.
            System.out.println("You are now fighting an " + enemy.name + "!");
        }
        if (random.nextInt(100) <= 20) { // Creates odds of 5-1 that the player will begin the battle
            System.out.println();
            System.out.println("The enemy is going first!");
            scanner.nextLine();
            enemyTurn(enemy); // Start the enemies turn
        } else {
            System.out.println();
            System.out.println("You are going first!");
            scanner.nextLine();
            playerTurn(enemy); // Start the players turn
        }
    }

    public void enemyTurn(Enemy enemy) {
        System.out.println("The " + enemy.name + enemy.weapon.enemyAttackDescription);
        boolean hits = (random.nextInt(100) + enemy.weapon.hitBonus > 30); // Creates a variable that checks if the value of a random number from 1-100 + the bonus from the enemy is greater than 30, if it is, it sets the variable to true, otherwise, sets it to false
        int damage = enemy.weapon.baseDamage + Dice.Roll(enemy.weapon.damageDiceSides); // Creates a variable that is set to the randomised damage of the enemies weapon using pre-determined statistics
        scanner.nextLine();
        if (hits) { // If the enemy does hit the player. . .
            System.out.println("The " + enemy.name + " hits you, dealing " + damage + " damage.");
            Player.health -= damage; // The player takes the pre-determined damage
            System.out.println("You are now on " + Player.health + " health.");
        } else { // Otherwise, inform the player of the missed attack
            System.out.println("The " + enemy.name + " misses you, hitting empty space.");
        }
        if ((Player.health <= 0)) { // Checks if the player's health is 0 or less
            System.out.println("With that blow you fall over, dead.");
        }else{
            System.out.println("It is now your turn.");
            scanner.nextLine();
            playerTurn(enemy); // Signal for the player to start their turn
        }
    }

    public void playerTurn(Enemy enemy) {
        System.out.println("What would you like to attack with?"); // Receives the input from the player as to their weapon choice
        System.out.println("1) " + Player.weapons[0].name);
        System.out.println("2) " + Player.weapons[1].name);
        System.out.println();
        int choice = scanner.nextInt();
        if (choice == 1 || choice == 2) { // If the choice is 1 or 2. . .
            Weapon weaponChoice = Player.weapons[choice - 1]; // Sets the weapon choice to the corresponding placement within the array
            System.out.println();
            System.out.println(weaponChoice.playerAttackDescription + enemy.name); // Prints out the attack description for the player attacking the enemy
            boolean hits = (random.nextInt(100) + enemy.weapon.hitBonus > 30); // Creates a variable that checks if the value of a random number from 1-100 + the bonus from the player is greater than 30, if it is, it sets the variable to true, otherwise, sets it to false
            int damage = weaponChoice.baseDamage + Dice.Roll(weaponChoice.damageDiceSides);scanner.nextLine(); // Creates a variable that is set to the randomised damage of the enemies weapon using pre-determined statistics
            if (hits) { // If the player hits the enemy. . .
                System.out.println("You hit the " + enemy.name + ", dealing " + damage + " damage.");
                enemy.health -= damage; // Deals the damage to the enemies health
            } else { // Otherwise, inform the player of the missed attack
                System.out.println("You miss the " + enemy.name + ", hitting empty space.");
            }
            if (enemy.health <= 0) { // If the enemies health is 0 or less. . .
                defeatEnemy(enemy); // Calls the method that processes the defeat of an enemy
            } else { // Otherwise, sends the turn back to the enemy
                System.out.println("It is now the enemy's turn.");
                scanner.nextLine();
                enemyTurn(enemy);
            }
        } else { // If the player enters a number other than 1 or 2, asks for a new number
            System.out.println("Invalid choice.");
            playerTurn(enemy);
        }
    }

    public void defeatEnemy(Enemy enemy) { // Handles the defeat of an enemy
        Game game = new Game(); // Initialises the Game class for static use
        Room room = Game.currentRoom; // Initialises the room variable as the current room that the player is in
        System.out.println("With that blow the " + enemy.name + " falls, dead.");
        scanner.nextLine();
        room.enemy = null; // Sets the enemy in the room to blank
        Player.health = 30; // Resets the player's health
        if (!enemy.name.equals("Troll")){ // Makes sure the enemy isn't the final enemy
            if (room.directions[0] != null){ // Directs the player to the next exit
                System.out.println("You have an exit to the north.");
            } else if (room.directions[1] != null){
                System.out.println("You have an exit to the east.");
            } else if (room.directions[2] != null){
                System.out.println("You have an exit to the south.");
            } else if (room.directions[3] != null){
                System.out.println("You have an exit to the west.");
            }
            game.playerAction(); // Sends the player back to take another action
        } else { // If the player has defeated the troll, end the game
            System.out.println("As you glance to the south, a glimmer of daylight catches your eye, offering a tantalizing hint of escape. With a sense of relief washing over you, you think to yourself, \"Finally, a way out of here.\" Determined, you stride towards the exit, eager to leave the dark confines of the cavern behind and embrace the freedom waiting beyond.");
            System.out.println();
            System.out.println("Thank you for playing!");
        }
    }
}
