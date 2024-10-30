public class SmallTreat extends Pastry {

  // Attributes
  private boolean isCrumbly;

  // No-argument constructor
  public SmallTreat() {
    super(19.99, "vanilla", 8.00);
    this.isCrumbly = true;
  }

  // Parameterized constructor
  public SmallTreat(double price, String flavor, double size, boolean isCrumbly) {
    super(price, flavor, size);
    this.isCrumbly = isCrumbly;
  }

  public boolean getIsCrumbly() {
    return this.isCrumbly;
  }
}
