/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

//fixed start and end position
public class Snake {

  int mouth;
  int tail;

  public Snake(int mouth, int tail) {
    if (mouth < tail) {
      throw new IllegalArgumentException("Snake is invalid");
    }
    this.mouth = mouth;
    this.tail = tail;
  }

  public int getMouth() {
    return mouth;
  }

  public void setMouth(int mouth) {
    this.mouth = mouth;
  }

  public int getTail() {
    return tail;
  }

  public void setTail(int tail) {
    this.tail = tail;
  }

}
