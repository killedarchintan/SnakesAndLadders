/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

public class Snake {

  int startPosition;
  int endPosition;

  public Snake(int startPosition, int endPosition) {
    this.startPosition = startPosition;
    this.endPosition = endPosition;
  }

  public int getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(int startPosition) {
    this.startPosition = startPosition;
  }

  public int getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(int endPosition) {
    this.endPosition = endPosition;
  }

}
