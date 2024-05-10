package map.room;

import hostile.enemy.Goblin;
import item.weapons.IronSpear;
import map.Room;

public class Room05 extends Room {

    public Room05() {
        this.directions = new Room[6];
        this.directions[1] = new Room06();
        this.enemy = new Goblin(14, 20, new IronSpear(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> east";
    }
}
