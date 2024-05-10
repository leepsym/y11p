package map.room;

import hostile.enemy.Skeleton;
import item.weapons.ShortBow;
import map.Room;

public class Room08 extends Room {

    public Room08() {
        this.directions = new Room[6];
        this.directions[1] = new Room09();
        this.enemy = new Skeleton(20, 12, new ShortBow(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> east";
    }
}
