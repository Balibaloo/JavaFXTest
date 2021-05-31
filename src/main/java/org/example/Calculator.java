package org.example;

import java.util.ArrayList;

public class Calculator {
  private Display display;

  private ArrayList<Character> argumentStorage;

  public Calculator() {
    argumentStorage = new ArrayList<>();
  }

  public Calculator(Display d) {
    this();
    display = d;
  }


  public Calculator inputDigit(Integer digit) {
    if (digit < 0 || digit > 9) {
      throw new IllegalArgumentException("Error: digit must be a number from 0-9");
    }

    argumentStorage.add(digit.toString().charAt(0));
    showDisplay();

    return this; // allows method chaining
  }


  public void showDisplay() {
    if (display == null) {
      System.err.println("Error: Calculator display method has not been set");
      return;
    }
    StringBuilder builder = new StringBuilder(argumentStorage.size());
    for (Character ch : argumentStorage) {
      builder.append(ch);
    }

    ifDisplayThenShow(builder.toString());
  }

  // used to update data when the argument storage changes
  public interface Display {
    void show(String data);
  }

  public void setDisplay(Display display) {
    this.display = display;
  }

  private void ifDisplayThenShow(String data) {
    if (display != null) {
      display.show(data);
    }
  }
}