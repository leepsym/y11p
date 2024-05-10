package map.room;

import hostile.enemy.Orc;
import item.weapons.IronSword;
import map.Room;

public class Room09 extends Room {

    public Room09() {
        this.directions = new Room[6];
        this.directions[1] = new Room010();
        this.enemy = new Orc(20, 35, new IronSword(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> east";
    }
}
