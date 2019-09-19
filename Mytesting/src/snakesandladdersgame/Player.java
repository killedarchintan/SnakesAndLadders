/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

//start position is 0
public class Player {
  public Player(String name) {
    this.name = name;
    this.position = 0;
  }
  private String name;
  private Integer position;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public int move(int numberDrawn, int maximumPosition) {
    int newPosition=this.position + numberDrawn;
    if (newPosition <= maximumPosition) {
      this.setPosition(newPosition);
    }
    return position;
  }

  public int rollDice(Dice dice) {
    return dice.roll();
  }

}
