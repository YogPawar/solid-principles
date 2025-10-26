package com.ocp.shapes.violation;

/**
 * This class is responsible to calculate the area.
 * <p>
 * suppose we need to add new shape in future we need to modify this code accommodate the new shape
 * <p>
 * every addition of new share requires the compilation of particular shape as well as
 * AreaCalculator class.
 */
class AreaCalculator {

  public double calculateArea(Object shape) {
    if (shape instanceof Rectangle) {
      Rectangle rectangle = (Rectangle) shape;
      return rectangle.width * rectangle.length;
    } else if (shape instanceof Circle) {
      Circle circle = (Circle) shape;
      return Math.PI * (circle.radius * circle.radius);
    }
    return 0;
  }

}
