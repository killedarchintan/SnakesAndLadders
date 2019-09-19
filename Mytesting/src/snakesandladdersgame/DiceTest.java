/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
package snakesandladdersgame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DiceTest {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void testRoll() {
    assertTrue(new CrockedDiceEven().roll() % 2 == 0);
  }

}
