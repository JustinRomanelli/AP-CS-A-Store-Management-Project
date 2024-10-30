public class Cupcake extends Pastry {
  // Attributes for the Cupcake class
  private boolean hasFrosting;
  private String frostingColor;

  // Constructors
  public Cupcake() {
    super(5.99, "chocolate", 2.50);
    this.hasFrosting = false;
    this.frostingColor = "N/A";
  }

  public Cupcake(double price, String flavor, double size, boolean hasFrosting, String frostingColor) {
    super(price, flavor, size);
    this.hasFrosting = hasFrosting;
    this.frostingColor = frostingColor;
  }

  // Accessor method
  public boolean getHasFrosting() {
    return this.hasFrosting;
  }

  // Mutator method
  public void setHasFrosting(boolean hasFrosting) {
    this.hasFrosting = hasFrosting;
  }

  // toString method
  public String toString() {
    return super.toString() + "\n\nCupcake Subclass\n--------------\nHas Frosting? " + (this.hasFrosting ? "Yes" : "No") + (this.hasFrosting ? ("\nFrosting Color: " + this.frostingColor) : "");
  }
}
