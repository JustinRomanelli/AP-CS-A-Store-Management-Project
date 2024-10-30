public class Scone extends Pastry {
  // Attributes
  // Height vertically
  private float height;

  // Constructors
  public Scone() {
    super(2.49, "plain", 2.00);
    this.height = 1.00f;
  }

  public Scone(double price, String flavor, double size, float height) {
    super(price, flavor, size);
    this.height = height;
  }

  // Accessor method
  public float getHeight() {
    return this.height;
  }

  // toString method
  public String toString() {
    return super.toString() + "\n\nScone Subclass\n--------------\nHeight: " + this.height;
  }
}
