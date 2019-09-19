/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

public class GreenSnake extends Snake {

  private boolean bitten;

  public GreenSnake(int mouth, int tail, boolean bitten) {
    super(mouth, tail);
    this.bitten = bitten;
  }

  public boolean isBitten() {
    return bitten;
  }

  @Override
  public int bite(Player player) {
    if (!bitten) {
      System.out.println("You are been bitten by Green snake, new position " + this.getTail());
      player.setPosition(this.getTail());
      bitten = true;
    }
    return player.getPosition();
  }

}
