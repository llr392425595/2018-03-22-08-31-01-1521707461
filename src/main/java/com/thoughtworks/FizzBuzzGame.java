package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {

  private List<String> results = new ArrayList<>();

  public void start(int count) {
    FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
    for (int i = 1; i <= count; i++) {
      results.add(fizzBuzzConverter.transform(i));
    }
  }

  public List<String> getResults() {
    return results;
  }
}


