package map;

import hostile.Enemy;
import hostile.Fight;
import main.Game;
import map.room.*;

public class RoomChange {
    public static void enterRoom(Room currentRoom, Room nextRoom) {
        Game game = new Game();
        Fight fight = new Fight();
        Enemy nextEnemy = nextRoom.enemy;
        Enemy currentEnemy = currentRoom.enemy;

        if (currentEnemy != null) {
            System.out.println("You move towards the next room, but the " + currentEnemy.name + " charges in front of you and blocks the entrance!");
            fight.engage();
        } else {
            System.out.println(nextRoom.roomDescription);
            Game.currentRoom = nextRoom;
            try {
                System.out.println("The enemy in this room is a " + nextEnemy.name + ".");
            } catch (NullPointerException e) {
                System.out.println("There is no enemy in this room.");
                System.out.println();
            }
        }
        game.playerAction();
    }
}
