package com.lskv.shapes.solution;

public class Client {

  public static void main(String[] args) {
    Square shape = new Square(5);
    Rectangle rectangle = new Rectangle(4, 5);

    System.out.println(
        shape.getArea()); //without backing the client code we can call the getArea() on
    // any subtype of shape. Here client contract is not changing.
    System.out.println(rectangle.getArea());
  }
}
