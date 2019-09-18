/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

import java.util.Random;

public class SnakesAndLadder {

  public static void main(String[] args) {

    Player player = new Player("komal");
    Board board = new Board();
    int numberDrawn = throwDice(player);
    System.err.println("Number drawn: " + numberDrawn);
    int position = move(player, board, numberDrawn);
    player.setPosition(position);
    System.out.println("player name " + player.getName() + "new position :" + position);

  }

  private static Integer move(Player player, Board board, int numberDrawn) {
    if (player.getPosition() + numberDrawn <= board.getSize()) {
      int newPosition = player.getPosition() + numberDrawn;
      return newPosition;
    } else {
      System.out.println("wait for your turn");
      return player.getPosition();
    }
  }

  private static int throwDice(Player player) {
    Random r = new Random();
    return r.nextInt(6);
  }

}
