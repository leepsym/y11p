package map.room;

import hostile.enemy.Goblin;
import item.weapons.Stick;
import map.Room;

public class Room02 extends Room {

    public Room02() {
        this.directions = new Room[6];
        this.directions[2] = new Room03();
        this.enemy = new Goblin(10, 0, new Stick(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> south";
    }
}
