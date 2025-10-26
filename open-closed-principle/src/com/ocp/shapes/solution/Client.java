package com.ocp.shapes.solution;

public class Client {

  public static void main(String[] args) {
    Shape circle = new Circle(10);
    System.out.println(circle.area());

    Shape rectangle = new Rectangle(10, 4);
    System.out.println(rectangle.area());

  }

}
