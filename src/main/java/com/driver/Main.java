package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly rwOnly = new RWOnly();
    //System.out.println(rwOnly.accountBalance(50)); //accountBalance(int) has private access in com.driver.RWOnly
    rwOnly.setAccountBalance(1000);
    System.out.println(rwOnly.getAccountBalance());
  }

}