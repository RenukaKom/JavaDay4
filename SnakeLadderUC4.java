package com.bridgelabz.snakeladder;
//Repeat till the Player reaches the winning position 100.
import java.util.Random;
public class SnakeLadderUC4 {
        static final int noPlay = 1;
        static final int ladder = 2;
        static final int snake = 3;
        int playerPosition = 0;
        int newPosition = 0;
        Random r = new Random();
        public static void main(String[] args) {
            System.out.println("Snake and Ladder Game Started");
            SnakeLadderUC4 player = new SnakeLadderUC4();
            player.showPosition();
            while (player.playerPosition != 100) {
                int dice = player.rollDice();
                player.play(dice);
                player.showPosition();

            }
        }
        public void showPosition() {
            System.out.println("player position: " + playerPosition);
        }
        public int rollDice() {
            int dice = r.nextInt(6) + 1;
            System.out.println("player throws a dice and get " + dice);
            return dice;
        }
        public void play(int dice) {
            int option = r.nextInt(3) + 1;

            switch (option) {
                case noPlay:
                    System.out.println("Player got no play");
                    playerPosition += dice;
                    break;
                case ladder:
                    System.out.println("Ladder appears");
                    playerPosition += dice;
                    if (playerPosition > 100) {
                        System.out.println("sorry position exceeds");
                        playerPosition -= dice;
                    }
                    break;
                case snake:
                    System.out.println("Snake appears");
                    playerPosition -= dice;
                    if (playerPosition < 0) {
                        playerPosition = 0;
                    }
                    break;
            }
        }
    }