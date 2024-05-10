package hostile;

import item.Weapon;
import main.*;
import map.Room;
import java.util.Scanner;
import java.util.Random;

public class Fight {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public void engage() {
        Enemy enemy = Game.currentRoom.enemy;
        if ("aeiouAEIOU".indexOf(enemy.name.charAt(0)) != -1) {
            System.out.println("You are now fighting a " + enemy.name + "!");
        } else {
            System.out.println("You are now fighting an " + enemy.name + "!");
        }
        if (random.nextInt(100) <= 20) {
            System.out.println();
            System.out.println("The enemy is going first!");
            scanner.nextLine();
            enemyTurn(enemy);
        } else {
            System.out.println();
            System.out.println("You are going first!");
            scanner.nextLine();
            playerTurn(enemy);
        }
    }

    public void enemyTurn(Enemy enemy) {
        Weapon enemyWeapon = enemy.weapon;
        System.out.println("The " + enemy.name + enemy.weapon.enemyAttackDescription);
        boolean hits = (random.nextInt(100) + enemy.weapon.hitBonus > 30);
        int damage = enemy.weapon.baseDamage + Dice.Roll(enemy.weapon.damageDiceSides);
        scanner.nextLine();
        if (hits) {
            System.out.println("The " + enemy.name + " hits you, dealing " + damage + " damage.");
            Player.health -= damage;
            System.out.println("You are now on " + Player.health + " health.");
        } else {
            System.out.println("The " + enemy.name + " misses you, hitting empty space.");
        }
        if ((Player.health <= 0)) {
            System.out.println("With that blow you fall over, dead.");
        }else{
            System.out.println("It is now your turn.");
            scanner.nextLine();
            playerTurn(enemy);
        }
    }

    public void playerTurn(Enemy enemy) {
        System.out.println("What would you like to attack with?");
        System.out.println("1) " + Player.weapons[0].name);
        System.out.println("2) " + Player.weapons[1].name);
        System.out.println();
        int choice = scanner.nextInt();
        if (choice == 1 || choice == 2) {
            Weapon weaponChoice = Player.weapons[choice - 1];
            System.out.println();
            System.out.println(weaponChoice.playerAttackDescription + enemy.name);
            boolean hits = (random.nextInt(100) + enemy.weapon.hitBonus > 30);
            int damage = weaponChoice.baseDamage + Dice.Roll(weaponChoice.damageDiceSides);scanner.nextLine();
            if (hits) {
                System.out.println("You hit the " + enemy.name + ", dealing " + damage + " damage.");
                enemy.health -= damage;
            } else {
                System.out.println("You miss the " + enemy.name + ", hitting empty space.");
            }
            if (enemy.health <= 0) {
                defeatEnemy(enemy);
            } else {
                System.out.println("It is now the enemy's turn.");
                scanner.nextLine();
                enemyTurn(enemy);
            }
        } else {
            System.out.println("Invalid choice.");
            playerTurn(enemy);
        }
    }

    public void defeatEnemy(Enemy enemy) {
        Game game = new Game();
        Room room = game.currentRoom;
        System.out.println("With that blow the " + enemy.name + " falls, dead.");
        scanner.nextLine();
        room.enemy = null;
        Player.health = 30;
        if (!enemy.name.equals("Troll")){
            if (room.directions[0] != null){
                System.out.println("You have an exit to the north.");
            } else if (room.directions[1] != null){
                System.out.println("You have an exit to the east.");
            } else if (room.directions[2] != null){
                System.out.println("You have an exit to the south.");
            } else if (room.directions[3] != null){
                System.out.println("You have an exit to the west.");
            }
            game.playerAction();
        } else {
            System.out.println("As you glance to the south, a glimmer of daylight catches your eye, offering a tantalizing hint of escape. With a sense of relief washing over you, you think to yourself, \"Finally, a way out of here.\" Determined, you stride towards the exit, eager to leave the dark confines of the cavern behind and embrace the freedom waiting beyond.");
            Main.finish();
            return;
        }
    }
}
