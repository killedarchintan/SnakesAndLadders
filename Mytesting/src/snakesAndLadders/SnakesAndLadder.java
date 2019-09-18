/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

// there is only one snake
// only one player
// player knows its position
public class SnakesAndLadder {

  public static void main(String[] args) {


    Player player = new Player("komal");
    Snake snake = new Snake(95, 13);
    Ladder ladder = new Ladder(35, 50);
    Board board = new Board(snake, player, ladder);
    int position = 0;

    while (player.getPosition() < board.getSize()) {
      int numberDrawn = player.rollDice();
      System.out.println("Number drawn: " + numberDrawn);
      position = board.movePlayer(numberDrawn);
      System.out.println("player name " + player.getName() + "new position :" + position);

    }
    System.out.println("THE WINNER :- " + player.getName());

  }


}
