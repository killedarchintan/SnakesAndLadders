/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesAndLadders;

import java.util.Random;

public class Dice {

  public static int roll() {
    Random r = new Random();
    return r.nextInt(6);
    //return 2;
  }

}
