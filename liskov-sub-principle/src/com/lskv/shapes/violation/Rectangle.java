package com.lskv.shapes.violation;

public class Rectangle {

  public int width;
  public int height;

  Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  Rectangle() {
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getArea() {
    return height * width;
  }
}
