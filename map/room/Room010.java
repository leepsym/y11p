package map.room;

import hostile.enemy.Troll;
import item.weapons.Club;
import map.Room;

public class Room010 extends Room {
    public Room010() {
        this.directions = new Room[6];
        this.directions[5] = new RoomN11();
        this.enemy = new Troll(30, 40, new Club(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> null";
    }
}
