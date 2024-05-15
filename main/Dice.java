package main;

public class Dice {
    public static int Roll(int sides){
        return (int)(Math.random()*sides) + 1;
    }
    // Takes an input from a user , (int), and returns a number as if a die with that many sides was rolled
}