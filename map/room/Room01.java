package map.room;

import map.Room;

public class Room01 extends Room {
    
    public Room01() {
        this.directions = new Room[6];
        this.directions[1] = new Room02();
        this.enemy = null;
        this.roomDescription = "In the chamber, forgotten barrels stand silent. No bodies, just echoes of the past. An exit to the east invites further exploration.";
    }
}