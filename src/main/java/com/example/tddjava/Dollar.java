package com.example.tddjava;

public class Dollar extends Money {

  public Dollar(final int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
}