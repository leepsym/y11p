package map.room;

import hostile.enemy.Orc;
import item.weapons.IronSword;
import map.Room;

public class Room07 extends Room {

    public Room07() {
        this.directions = new Room[6];
        this.directions[1] = new Room08();
        this.enemy = new Orc(16, 30, new IronSword(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> east";
    }
}
