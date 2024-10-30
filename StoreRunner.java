import java.util.Scanner;
import java.util.ArrayList;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    // Store management / inventory project

    // ArrayList used to keep track of all of the pastries.    
    ArrayList<Object> pastries = new ArrayList<>();

    // Default pastries to be put into the pastries ArrayList.
    
    Cookie cookie = new Cookie();
    Scone scone = new Scone();
    Cake cake = new Cake();
    Cupcake cupcake = new Cupcake();

    // Add the baseline pastries.
    pastries.add(cookie);
    pastries.add(scone);
    pastries.add(cake);
    pastries.add(cupcake);

    // Variables to make the program run.
    boolean running = true;
    String actionToPerform = "";
    String typeOfPastry = "";

    // This loops is where the program primarily takes place.
    // The user can add, remove, or check stock, as well as exit out of the loop.
    while (running) {
      
      System.out.println("Do you want to add stock (1), remove stock (2), check stock (3), or exit (4 / \"exit\")?");
      
      actionToPerform = input.nextLine();

      // Add stock
      if (actionToPerform.equals("1")) {
        
        System.out.println("What item do you want to add? Type \"Cookie\", \"Scone\", \"Cake\", or \"Cupcake\".");

        typeOfPastry = input.nextLine();

        // Chooses which item to add
        // Each of the new pastries is made with a custom method from UtilMethods.java.
        switch (typeOfPastry.toLowerCase()) {
          case "cookie":
            Cookie newCookie = UtilMethods.createCookie();
            pastries.add(newCookie);
            break;
          case "scone":
            Scone newScone = UtilMethods.createScone();
            pastries.add(newScone);
            break;
          case "cake":
            Cake newCake = UtilMethods.createCake();
            pastries.add(newCake);
            break;
          case "cupcake":
            Cupcake newCupcake = UtilMethods.createCupcake();
            pastries.add(newCupcake);
            break;
        }
      } else if (actionToPerform.equals("2")) { // Remove stock
        
        System.out.println("What item do you want to remove? Type \"Cookie\", \"Scone\", \"Cake\", or \"Cupcake\".");

        typeOfPastry = input.nextLine();

        // Determine which pastry was entered, then remove it from the pastries ArrayList.
        // This is done with the methods created in UtilMethods.java.
        switch (typeOfPastry.toLowerCase()) {
          case "cookie":
            pastries = UtilMethods.removeCookie(pastries);
            
            continue;
          case "scone":
            pastries = UtilMethods.removeScone(pastries);
            
            continue;
          case "cake":
            pastries = UtilMethods.removeCake(pastries);
            
            continue;
          case "cupcake":
            pastries = UtilMethods.removeCupcake(pastries);
            
            continue;
        }
      } else if (actionToPerform.equals("3")) { // Print stock
        if (pastries.isEmpty()) {
          System.out.println("There is currently nothing in stock.");
        }
        else {
          // Prints the stock
          for (Object pastry : pastries) {
            System.out.println(pastry.toString() + "\n");
          }
        }
      } else if (actionToPerform.toLowerCase().equals("exit") || actionToPerform.equals("4")) { // Exit the program, if asked to by the user.
        System.out.println("Exiting program...");
        running = false;
      }
    }

    input.close();
  }
}
