/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

import java.util.ArrayList;
import java.util.List;

public class BoardBuilder {

  private int size = 100;
  private List<Snake> snakes;
  private Player player;
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
    this.player = player;
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
    return new Board(snakes, player, ladder);
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

}
