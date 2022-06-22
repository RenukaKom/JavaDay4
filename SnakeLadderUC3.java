package com.bridgelabz.snakeladder;

public class SnakeLadderUC3 {
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
        int position1, newPlace;
        int option = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
        System.out.println("option is:" + option);
        if (option == 1) {
            position1 = dice;
            System.out.println("player remain at same position: " + position1);
            newPlace = position1;
            System.out.println("this is new place " + position1);
        } else if (option == 2) {
            System.out.println("Ladder appears");
            position1 = dice + dice;
            int ladderPlace = dice + position1;
            System.out.println("player moves forward by " + position1 + "steps");
            System.out.println("Player 1 is now at " + ladderPlace + " place");
            newPlace = ladderPlace;
            System.out.println("this is new place " + ladderPlace);
        } else {
            System.out.println("Snake appears");
            position1 = dice;
            int snakePlace = dice - dice;
            System.out.println("player moves backward by " + position1 + " steps");
            System.out.println("Player 1 is now at " + snakePlace + " place");
            newPlace = snakePlace;
            System.out.println("this is new place " + snakePlace);
        }
    }
}