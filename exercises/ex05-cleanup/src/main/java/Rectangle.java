/**
 * Class for a rectangle with a width and a height.
 *
 * <p>Contains a number of methods for manipulation of said rectangle.</p>
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Construct an Rectangle from width and height doubles.
   *
   * @param w any double
   * @param h any double
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Return area of rectangle.
   *
   * @return area of rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle by a certain factor.
   *
   * @param factor by which to scale
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compare whether this rectangle has a larger area than another rectangle.
   *
   * @param other which is the rectangle to compare against
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
