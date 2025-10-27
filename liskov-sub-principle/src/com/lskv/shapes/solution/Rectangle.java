package com.lskv.shapes.solution;

public class Rectangle implements Shape {

  protected int width;
  protected int height;

  Rectangle(int width, int height) {
    this.height = height;
    this.width = width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }


  @Override
  public int getArea() {
    return height * width;
  }
}
