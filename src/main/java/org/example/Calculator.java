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