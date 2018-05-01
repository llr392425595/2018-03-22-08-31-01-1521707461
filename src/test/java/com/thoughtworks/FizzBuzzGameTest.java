package com.thoughtworks;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzGameTest {

  private FizzBuzzGame game;

  @Before
  public void setup() {
    game = new FizzBuzzGame();
  }

  @Test
  public void should_return_Fizz_when_have_3() {
    String value1 = game.transform(13);
    String expected1 = "Fizz";
    String value2 = game.transform(35);
    String expected2 = "Fizz";
    String value3 = game.transform(43);
    String expected3 = "Fizz";
    String value4 = game.transform(53);
    String expected4 = "Fizz";

    assertEquals(expected1, value1);
    assertEquals(expected2, value2);
    assertEquals(expected3, value3);
    assertEquals(expected4, value4);
  }


  @Test
  public void should_return_numStr_when_given_1() {
    String value = game.transform(1);
    String expected = "1";

    assertEquals(expected, value);
  }

  @Test
  public void should_return_Fizz_when_number_is_multiple_of_3() {
    String value1 = game.transform(3);
    String value2 = game.transform(6);
    String value3 = game.transform(9);
    String expected = "Fizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
    assertEquals(expected, value3);
  }

  @Test
  public void should_return_Buzz_when_number_is_multiple_of_5() {
    String value1 = game.transform(5);
    String value2 = game.transform(10);
    String value3 = game.transform(20);
    String expected = "Buzz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
    assertEquals(expected, value3);
  }

  @Test
  public void should_return_Whizz_when_number_is_multiple_of_7() {
    String value1 = game.transform(7);
    String value2 = game.transform(14);
    String value3 = game.transform(28);
    String expected = "Whizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
    assertEquals(expected, value3);
  }

  @Test
  public void should_return_FizzBuzz_when_number_is_multiple_of_3_5() {
    String value1 = game.transform(15);
    String value2 = game.transform(45);
    String expected = "FizzBuzz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
  }

  @Test
  public void should_return_FizzWhizz_when_number_is_multiple_of_3_7() {
    String value1 = game.transform(21);
    String value2 = game.transform(42);
    String expected = "FizzWhizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
  }

  @Test
  public void should_return_BuzzWhizz_when_number_is_multiple_of_5_7() {
    String value1 = game.transform(70);
    String value2 = game.transform(140);
    String expected = "BuzzWhizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
  }

  @Test
  public void should_return_FizzBuzzWhizz_when_number_is_multiple_of_3_5_7() {
    String value1 = game.transform(105);
    String value2 = game.transform(210);
    String expected = "FizzBuzzWhizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
  }

}
