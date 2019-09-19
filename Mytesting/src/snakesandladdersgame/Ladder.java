/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

public class Ladder {

  int startPosition;
  int endPosition;

  public Ladder(int startPosition, int endPosition) {
    if (startPosition > endPosition) {
      throw new IllegalArgumentException("Ladder is invalid");
    }
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
