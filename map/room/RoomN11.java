package map.room;

import hostile.enemy.Troll;
import item.weapons.Club;
import map.Room;

public class RoomN11 extends Room {
    public RoomN11(){
        this.directions = new Room[6];
        this.directions[4] = new Room010();
        this.enemy = null;
        this.roomDescription = "next room -> null";
    }
}
