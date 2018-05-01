package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {

  private static final String WHIZZ = "Whizz";
  private static final String BUZZ = "Buzz";
  private static final String FIZZ = "Fizz";
  private static final String NO_STR = "";
  private static final int FIZZ_NUM = 3;
  private static final int BUZZ_NUM = 5;
  private static final int WHIZZ_NUM = 7;
  private List<String> results = new ArrayList<>();

  public void start(int count) {
    for (int i = 1; i <= count; i++) {
      results.add(transform(i));
    }
  }

  public String transform(int number) {
    String word = NO_STR;
    String num = String.valueOf(number);
    if (num.contains(String.valueOf(FIZZ_NUM))) {
      return FIZZ;
    }
    word += threeMultiple(number) + fiveMultiple(number) + sevenMultiple(number);
    if (word.equals("")) {
      return num;
    }
    return word;

  }

  private String sevenMultiple(int number) {
    return number % WHIZZ_NUM == 0 ? WHIZZ : NO_STR;
  }

  private String fiveMultiple(int number) {
    return number % BUZZ_NUM == 0 ? BUZZ : NO_STR;
  }

  private String threeMultiple(int number) {
    return number % FIZZ_NUM == 0 ? FIZZ : NO_STR;
  }

  public List<String> getResults() {
    return results;
  }
}


