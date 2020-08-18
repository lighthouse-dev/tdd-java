package com.example.tddjava;

class Money {

  protected int amount;

  protected String currency;
  
  Money (int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  Money times(int multiplier) {
    // return null;
    return new Money(amount * multiplier, currency);
  }

  String currency() {
    return currency;
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount
      && currency.equals(money.currency());
      // && getClass().equals(money.getClass());
  }

  public String toString() {
    // これが呼ばれるタイミングは？
    //  equalsのようにObjectクラスに定義されているものをOverrideしている
    //  Objectが自動にStringに変換する時に、CompilerはそのクラスのtoString()を利用
    return amount + " " + currency;
  }

  static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }
}
