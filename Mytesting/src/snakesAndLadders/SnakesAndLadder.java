/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

import java.util.Random;

public class SnakesAndLadder {

  public static void main(String[] args) {

    SnakesAndLadder theGame = new SnakesAndLadder();
    Player player = new Player("komal");
    Snake snake = new Snake(4, 2);
    Board board = new Board();
    int position = 0;

    while (player.getPosition() < board.getSize()) {
      int numberDrawn = Dice.roll();
      System.out.println("Number drawn: " + numberDrawn);
      position = theGame.calculateNewPosition(player, board, numberDrawn, snake);

      player.move(position);
      System.out.println("player name " + player.getName() + "new position :" + position);

    }
    System.out.println("THE WINNER :- " + player.getName());

  }

  private Integer calculateNewPosition(Player player, Board board, int numberDrawn, Snake snake) {
    Integer newPosition = player.getPosition() + numberDrawn;
    if (newPosition <= board.getSize() && newPosition != snake.getStartPosition()) {
      return newPosition;
    } else if (newPosition == snake.getStartPosition()) {
      System.out.println("HISSsssssssss" + "You have been bitten by a snake");
      return snake.getEndPosition();
    } else {
      System.out.println("wait for your turn");
      return player.getPosition();
    }
  }



}
