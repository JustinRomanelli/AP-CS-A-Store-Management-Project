public class Cake extends Pastry {
  // Attributes for the Cake class
  private int numOfLayers;
  private boolean hasFrosting;
  private String design;
  private String frostingColor;

  // Constructors
  public Cake() {
    super(29.99, "vanilla", 5.00);
    this.numOfLayers = 1;
    this.hasFrosting = false;
    this.design = "Happy Birthday";
    this.frostingColor = "N/A";
  }

  public Cake(double price, String flavor, double size, int numOfLayers, boolean hasFrosting, String design, String frostingColor) {
    super(price, flavor, size);
    this.numOfLayers = numOfLayers;
    this.hasFrosting = hasFrosting;
    this.design = design;
    this.frostingColor = frostingColor;
  }

  // Accessor methods
  public int getNumOfLayers() {
    return this.numOfLayers;
  }

  public boolean getHasFrosting() {
    return this.hasFrosting;
  }

  public String getDesign() {
    return this.design;
  }

  // Mutator methods
  public void setHasFrosting(boolean hasFrosting) {
    this.hasFrosting = hasFrosting;
  }

  // toString method
  public String toString() {
    return super.toString() + "\n\nCake Subclass\n--------------\nNumber of Layers: " + this.numOfLayers + "\nHas Frosting? " + (this.hasFrosting ? "Yes" : "No") + "\nDesign: " + this.design + (this.hasFrosting ? ("\nFrosting color: " + this.frostingColor) : "");
  }
}
