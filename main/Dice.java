package main;

public class Dice {
    public static int Roll(int sides){
        return (int)(Math.random()*sides) + 1;
    }
}