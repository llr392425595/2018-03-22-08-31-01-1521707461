package com.thoughtworks;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzConverterTest {

  @Test
  public void should_return_numStr_when_given_1() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    String value = fizzBuzzConverter.transform(1);
    String expected = "1";

    assertEquals(expected, value);
  }

  @Test
  public void should_return_Fizz_when_number_is_multiple_of_3() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    String value1 = fizzBuzzConverter.transform(3);
    String value2 = fizzBuzzConverter.transform(6);
    String value3 = fizzBuzzConverter.transform(9);
    String expected = "Fizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
    assertEquals(expected, value3);
  }

  @Test
  public void should_return_Buzz_when_number_is_multiple_of_5() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    String value1 = fizzBuzzConverter.transform(5);
    String value2 = fizzBuzzConverter.transform(10);
    String value3 = fizzBuzzConverter.transform(20);
    String expected = "Buzz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
    assertEquals(expected, value3);
  }

  @Test
  public void should_return_Whizz_when_number_is_multiple_of_7() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    String value1 = fizzBuzzConverter.transform(7);
    String value2 = fizzBuzzConverter.transform(14);
    String value3 = fizzBuzzConverter.transform(28);
    String expected = "Whizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
    assertEquals(expected, value3);
  }

  @Test
  public void should_return_FizzBuzz_when_number_is_multiple_of_3_5() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    String value1 = fizzBuzzConverter.transform(15);
    String value2 = fizzBuzzConverter.transform(45);
    String expected = "FizzBuzz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
  }

  @Test
  public void should_return_FizzWhizz_when_number_is_multiple_of_3_7() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    String value1 = fizzBuzzConverter.transform(21);
    String value2 = fizzBuzzConverter.transform(42);
    String expected = "FizzWhizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
  }

  @Test
  public void should_return_BuzzWhizz_when_number_is_multiple_of_5_7() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    String value1 = fizzBuzzConverter.transform(70);
    String value2 = fizzBuzzConverter.transform(140);
    String expected = "BuzzWhizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
  }

  @Test
  public void should_return_FizzBuzzWhizz_when_number_is_multiple_of_3_5_7() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    String value1 = fizzBuzzConverter.transform(105);
    String value2 = fizzBuzzConverter.transform(210);
    String expected = "FizzBuzzWhizz";

    assertEquals(expected, value1);
    assertEquals(expected, value2);
  }

  @Test
  public void should_return_Fizz_when_number_contain_first_special_number() {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    String value1 = fizzBuzzConverter.transform(13);
    String expected1 = "Fizz";
    String value2 = fizzBuzzConverter.transform(35);
    String expected2 = "Fizz";
    String value3 = fizzBuzzConverter.transform(43);
    String expected3 = "Fizz";
    String value4 = fizzBuzzConverter.transform(53);
    String expected4 = "Fizz";

    assertEquals(expected1, value1);
    assertEquals(expected2, value2);
    assertEquals(expected3, value3);
    assertEquals(expected4, value4);
  }


}