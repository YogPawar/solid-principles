package com.lskv.shapes.violation;

public class Square extends Rectangle {

  Square(int width, int height) {
    super(width, height);
  }

  Square() {
    super();
  }


  @Override
  public void setHeight(int height) {
    this.height = height;
    this.width = height;
  }

  @Override
  public void setWidth(int width) {
    this.width = width;
    this.height = width;
  }
}
