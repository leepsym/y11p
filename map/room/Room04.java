package map.room;

import hostile.enemy.Kobold;
import item.weapons.JaggedDagger;
import map.Room;

public class Room04 extends Room {

    public Room04() {
        this.directions = new Room[6];
        this.directions[0] = new Room05();
        this.enemy = new Kobold(9, 15, new JaggedDagger(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> north";
    }
}
