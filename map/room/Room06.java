package map.room;

import hostile.enemy.Skeleton;
import item.weapons.RustedShortSword;
import map.Room;

public class Room06 extends Room {

    public Room06() {
        this.directions = new Room[6];
        this.directions[2] = new Room07();
        this.enemy = new Skeleton(16, 24, new RustedShortSword(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> south";
    }
}
