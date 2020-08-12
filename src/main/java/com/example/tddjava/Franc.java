package com.example.tddjava;

public class Franc extends Money {

  public Franc(final int amount) {
    this.amount = amount;
  }

  Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }
}