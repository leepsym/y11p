package map.room;

// Library Imports
import hostile.enemy.Kobold; // Imports the Kobold class from the hostile.enemy package
import item.weapons.JaggedDagger; // Imports the JaggedDagger class from the item.weapons package
import map.Room; // Imports the Room class from the map package to be used in referencing the direction of the next room and as a superClass

public class Room04 extends Room { // Initialises Room01 with Room as its superClass

    public Room04() {
        this.directions = new Room[6];
        this.directions[0] = new Room05();
        this.enemy = new Kobold(9, 15, new JaggedDagger(null, 0, 0 ,0, 0));
        this.roomDescription = "next room -> north";
    }
}
