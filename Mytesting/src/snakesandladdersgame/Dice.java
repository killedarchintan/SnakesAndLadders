/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

import java.util.Random;

// dice will have 6 faces
public class Dice {

  public int roll() {
    Random r = new Random();
    return r.nextInt(6);
  }


}
