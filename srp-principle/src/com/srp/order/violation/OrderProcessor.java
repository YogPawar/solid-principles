package com.srp.order.violation;

public class OrderProcessor {

  public void processOrder(String order) {
    System.out.println("Processing order for " + order);
  }

  public void updateInventory(String order) {
    System.out.println("Updating inventory for order " + order);
  }

}
