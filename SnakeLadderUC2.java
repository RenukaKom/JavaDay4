package com.bridgelabz.snakeladder;

public class SnakeLadderUC2 {
    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game Started");
        int player = (int) Math.floor(Math.random() * (1) + 1);
        System.out.println("Player " + player + " starts the game ");
        int steps = 0;
        System.out.println("Player started game from step " + steps);
        int dice = (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
        System.out.println("Player throws a dice and get " + dice);
        System.out.println("Player moves forward by " + dice + " steps");
        System.out.println("Player 1 is now at " + dice + " place");
    }
}