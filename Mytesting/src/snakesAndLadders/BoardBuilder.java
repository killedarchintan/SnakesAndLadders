/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

public class BoardBuilder {

  private int size = 100;
  private Snake snake;
  private Player player;
  private Ladder ladder;

  public BoardBuilder addSnake(Snake snake) {
    this.snake = snake;
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
    validateSnake(snake);
    validateLadder(ladder);
    if (snake.getMouth() == ladder.getStartPosition()) {
      throw new IllegalArgumentException("Change ladder or Snake");
    }
    return new Board(snake, player, ladder);
  }

  private void validateLadder(Ladder ladder) {
    if (ladder.getEndPosition() > size) {
      throw new IllegalArgumentException("ladder is not fit for board");
    }
  }

  private void validateSnake(Snake snake) {
    if (snake.getMouth() > size) {
      throw new IllegalArgumentException("Snake is not fit for board");
    }
  }

}
