package map.room;

import hostile.enemy.Goblin;
import item.weapons.Stick;
import map.Room;

public class Room03 extends Room {

    public Room03() {
        this.directions = new Room[6];
        this.directions[1] = new Room04();
        this.enemy = new Goblin(12, 15, new Stick(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> east";
    }
}
