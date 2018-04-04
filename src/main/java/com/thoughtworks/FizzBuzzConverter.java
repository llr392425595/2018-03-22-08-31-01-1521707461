package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzConverter {

  private static final int First = 3;
  private static final int Second = 5;
  private static final int Third = 7;
  private static final String Fizz = "Fizz";
  private static final String Buzz = "Buzz";
  private static final String Whizz = "Whizz";

  private boolean isJustMultipleOfFirst(int num) {
    return num % First == 0 && num % Second != 0 && num % Third != 0;
  }

  private boolean isJustMultipleOfSecond(int num) {
    return num % First != 0 && num % Second == 0 && num % Third != 0;
  }

  private boolean isJustMultipleOfThird(int num) {
    return num % First != 0 && num % Second != 0 && num % Third == 0;
  }

  private boolean isMultipleOfFirstAndSecond(int num) {
    return num % First == 0 && num % Second == 0 && num % Third != 0;
  }

  private boolean isMultipleOfFirstAndThird(int num) {
    return num % First == 0 && num % Second != 0 && num % Third == 0;
  }

  private boolean isMultipleOfSecondAndThird(int num) {
    return num % First != 0 && num % Second == 0 && num % Third == 0;
  }

  private boolean isMultipleOfAll(int num) {
    return num % First == 0 && num % Second == 0 && num % Third == 0;
  }

  private List<Integer> numArray(Integer num) {
    String str = num.toString();
    List<Integer> intArray = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      Character ch = str.charAt(i);
      intArray.add(Integer.parseInt(ch.toString()));
    }
    return intArray;
  }

  private boolean containFirst(int num){
    List<Integer> numArray = numArray(num);
    return numArray.contains(First);
  }

  public String transform(int num) {
    if(containFirst(num)){
      return Fizz;
    }else {
      if (isJustMultipleOfFirst(num)) { return Fizz; }
      if (isJustMultipleOfSecond(num)) { return Buzz; }
      if (isJustMultipleOfThird(num)) { return Whizz; }
      if (isMultipleOfFirstAndSecond(num)) { return Fizz + Buzz; }
      if (isMultipleOfFirstAndThird(num)) { return Fizz + Whizz; }
      if (isMultipleOfSecondAndThird(num)) { return Buzz + Whizz; }
      if (isMultipleOfAll(num)) { return Fizz + Buzz + Whizz; }
      return String.valueOf(num);
    }
  }
}
