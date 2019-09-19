/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardBuilder {

  private int size = 100;
  private List<Snake> snakes;
  private List<Player> players;
  private Map<Player, Integer> playerPosition;

  private Ladder ladder;

  public BoardBuilder addSnake(Snake snake) {
    if (snakes == null) {
      snakes = new ArrayList<>();
    }
    snakes.add(snake);
    return this;
  }

  public BoardBuilder addLadder(Ladder ladder) {
    this.ladder = ladder;
    return this;
  }

  public BoardBuilder addPlayer(Player player) {
    if (players == null) {
      players = new ArrayList<>();
      playerPosition = new HashMap<>();
    }
    players.add(player);
    playerPosition.put(player, 0);
    return this;
  }

  public Board build() {
    validateSnakes(snakes);
    validateLadder(ladder);
    for (Snake snake : snakes) {
      if (snake.getMouth() == ladder.getStartPosition()) {
        throw new IllegalArgumentException("Change ladder or Snake");
      }
    }
    return new Board(snakes, players, ladder, playerPosition);
  }
  private void validateLadder(Ladder ladder) {
    if (ladder.getEndPosition() > size) {
      throw new IllegalArgumentException("ladder is not fit for board");
    }
  }

  private void validateSnakes(List<Snake> snakes) {
    for (Snake snake : snakes) {
      if (snake.getMouth() > size) {
        throw new IllegalArgumentException("Snake is not fit for board");
      }
    }
    for (int i = 0; i < snakes.size(); i++) {
      for (int j = 0; j < snakes.size(); j++) {
        if (i != j && snakes.get(i).getMouth() == snakes.get(j).getMouth()) {
          throw new IllegalArgumentException("Atleast change mouth position of one snake");
        }
      }
    }
  }

  public List<Player> getPlayers() {
    return players;
  }

}
