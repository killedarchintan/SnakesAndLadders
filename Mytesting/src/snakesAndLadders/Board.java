/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

// size is 100
public class Board {

  private int size = 100;
  private Snake snake;
  private Player player;
  private Ladder ladder;

  public Board(Snake snake, Player player, Ladder ladder) {
    validateSnake(snake);
    validateLadder(ladder);
    if (snake.getMouth() == ladder.getStartPosition()) {
      throw new IllegalArgumentException("Change ladder or Snake");
    }
    this.snake = snake;
    this.player = player;
    this.ladder = ladder;
  }

  private void validateLadder(Ladder ladder) {
    if (ladder.getEndPosition() > size) {
      throw new IllegalArgumentException("ladder is not fit for board");
    }
  }

  private void validateSnake(Snake snake) {
    if (snake.getMouth() > size)
    {
      throw new IllegalArgumentException("Snake is not fit for board");
    }
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Snake getSnake() {
    return snake;
  }

  public void setSnake(Snake snake) {
    this.snake = snake;
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
    if (newPosition == snake.getMouth()) {
      System.out.println("player name " + player.getName() + "new position :" + newPosition);
      System.out.println("HISSsssssssss " + "You have been bitten by a snake");
      player.setPosition(snake.getTail());
      return player.getPosition();
    } else if (newPosition == ladder.getStartPosition()) {
      System.out.println("YAyy!! " + "you are going up the ladder");
      player.setPosition(ladder.getEndPosition());
      return player.getPosition();
    }
    return newPosition;
  }

}
