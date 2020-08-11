package com.example.tddjava;

public class Dollar extends Money {

  private final int amount;

  public Dollar(final int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  public boolean equals(Object object) {
    Dollar dollar = (Dollar) object;
    return amount == dollar.amount;
  }
}