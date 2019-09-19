/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

import java.util.List;
import java.util.Map;

// size is 100
public class Board {

  private int size = 100;
  private List<Snake> snakes;
  private List<Player> players;
  private Ladder ladder;
  private Map<Player, Integer> playerPosition;

  public Board(List<Snake> snakes, List<Player> players, Ladder ladder, Map<Player, Integer> playerPosition) {
    this.snakes = snakes;
    this.players = players;
    this.ladder = ladder;
    this.playerPosition = playerPosition;
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

  public List<Player> getPlayers() {
    return players;
  }

  public Ladder getLadder() {
    return ladder;
  }

  public void setLadder(Ladder ladder) {
    this.ladder = ladder;
  }

  public int movePlayer(int numberDrawn, Player player) {
    int newPosition = player.move(numberDrawn, size);
    for(Snake snake:snakes) {
      if (newPosition == snake.getMouth()) {
        System.out.println("player name " + player.getName() + "new position :" + newPosition);
        System.out.println("HISSsssssssss " + "You have been bitten by a snake");
        newPosition = snake.bite(player);
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
