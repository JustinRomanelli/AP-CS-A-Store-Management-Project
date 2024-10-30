public class Pastry {

  // Attributes for a general pastry
  private double price;
  private String flavor;
  private double size;

  // No-argument constructor, sets default values
  public Pastry() {
    this.price = 19.99;
    this.flavor = "vanilla";
    this.size = 8.00;
  }

  // Parameterized constructor
  public Pastry(double price, String flavor, double size) {
    this.price = price;
    this.flavor = flavor;
    this.size = size;
  }

  // Accessor Methods:
  
  public double getPrice() {
    return this.price;
  }

  public String getFlavor() {
    return this.flavor;
  }

  public double getSize() {
    return this.size;
  }

  // Mutator Methods:
  
  public void setPrice(double price) {
    this.price = price;
  }

  // toString prints information about the Pastry to the console.  
  public String toString() {
    return "Pastry\n--------------\nprice: " + this.price + "\nflavor: " + this.flavor + "\nsize: " + this.size;
  }
}
