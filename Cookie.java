public class Cookie extends Pastry {

  // Attributes
  // The type of the cookie, as in "chocolate chip", "sugar", etc.
  private String typeOfCookie;

  // Constructors
  public Cookie() {
    super(2.99, "plain", 3.00);
    this.typeOfCookie = "chocolate chip";
  }

  public Cookie(double price, String flavor, double size, String typeOfCookie) {
    super(price, flavor, size);
    this.typeOfCookie = typeOfCookie;
  }
  
  // Accessor Methods
  public String getTypeOfCookie() {
    return this.typeOfCookie;
  }

  // toString method
  public String toString() {
    return super.toString() + "\n\nCookie Subclass\n--------------\nType of Cookie: " + this.typeOfCookie; 
  }
}
