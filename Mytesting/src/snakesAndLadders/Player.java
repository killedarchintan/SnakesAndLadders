/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

public class Player {
  public Player(String name) {
    this.name = name;
    this.position = 1;
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

}
