package com.lskv.shapes.violation;

public class Client {

  public static void main(String[] args) {
    Rectangle rectangle = new Square();
    rectangle.setHeight(4);
    rectangle.setWidth(5);
    System.out.println(rectangle.getArea()); //Expected was 20 but it returns 25

  }

}
