/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

public class CrockedDiceEven extends Dice {

  @Override
  public int roll() {
    int diceThrow = super.roll();
    if (diceThrow % 2 == 0) {
      return diceThrow;
    } else
    {
      return diceThrow + 1;
    }
  }
}
