/*
 * Controlguide
 * Copyright (c) Siemens Mobility GmbH 2019, All Rights Reserved, Confidential
 */
/**
 * 
 */
package snakesandladdersgame;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author z003vkxr
 *
 */
class BoardTest {

  /**
   * @throws java.lang.Exception
   */
  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception {
  }

  /**
   * Test method for {@link snakesandladdersgame.Board#movePlayer(int)}.
   */
  @Test
  void testMovePlayer() {
    int numberDrawn = 5;
    List<Snake> snakes = new ArrayList<>();
    snakes.add(new Snake(5, 3));
    Board board = new Board(snakes, new Player("Tejas"), new Ladder(3, 8));
    assertTrue(8 == board.movePlayer(numberDrawn));
    ;
  }

}
