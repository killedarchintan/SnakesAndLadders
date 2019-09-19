/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

import java.util.stream.Collectors;

// there is only one snake
// only one player
// player knows its position
public class SnakesAndLadder {

  public static void main(String[] args) {

    Dice dice = new CrockedDiceEven();
    Player komal = new Player("komal");
    Player chintan = new Player("chintan");

    Snake snake1 = new Snake(95, 13);
    Ladder ladder = new Ladder(2, 50);
    Snake snake2 = new Snake(13, 2);
    Snake greenSnake = new GreenSnake(14, 4, false);
    BoardBuilder boardBuilder= new BoardBuilder();
    Board board = boardBuilder.addSnake(snake1).addSnake(greenSnake)
        .addLadder(ladder).addPlayer(komal).addPlayer(chintan).build();
    int position = 0;

    while (position < board.getSize()) {
      for (Player player : board.getPlayers()) {
      int numberDrawn = player.rollDice(dice);
      System.out.println("Number drawn: " + numberDrawn);
        position = board.movePlayer(numberDrawn, player);
      System.out.println("player name " + player.getName() + "new position :" + position);
        if (position == 100) {
          break;
        }
      }
    }

    System.out.println("THE WINNER :- " + board.getPlayers().stream().filter(s -> s.getPosition() == 100).collect(Collectors.toList()).get(0).getName());

  }


}
