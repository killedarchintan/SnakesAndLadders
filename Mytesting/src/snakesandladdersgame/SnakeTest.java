/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SnakeTest {

  @Test
  void testGreenSnakeBite() {
    Snake snake=new Snake(4,2);
    Snake greenSnake = new GreenSnake(5, 1, false);
    Player player= new Player("Tejas");
    assertEquals(1, greenSnake.bite(player));
  }

}
