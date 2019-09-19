/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

import java.util.List;

// size is 100
public class Board {

  private int size = 100;
  private List<Snake> snakes;
  private Player player;
  private Ladder ladder;

  public Board(List<Snake> snakes, Player player, Ladder ladder) {
    this.snakes = snakes;
    this.player = player;
    this.ladder = ladder;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public List<Snake> getSnakes() {
    return snakes;
  }

  public void setSnakes(List<Snake> snakes) {
    this.snakes = snakes;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  public Ladder getLadder() {
    return ladder;
  }

  public void setLadder(Ladder ladder) {
    this.ladder = ladder;
  }

  public int movePlayer(int numberDrawn) {
    int newPosition = player.move(numberDrawn,size);
    for(Snake snake:snakes) {
      if (newPosition == snake.getMouth()) {
        System.out.println("player name " + player.getName() + "new position :" + newPosition);
        System.out.println("HISSsssssssss " + "You have been bitten by a snake");
        player.setPosition(snake.getTail());
        newPosition = player.getPosition();
      }
    }
    if (newPosition == ladder.getStartPosition()) {
      System.out.println("YAyy!! " + "you are going up the ladder");
      player.setPosition(ladder.getEndPosition());
      return player.getPosition();
    }
    return newPosition;
  }

}
