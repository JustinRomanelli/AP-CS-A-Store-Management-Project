import java.util.Scanner;
import java.util.ArrayList;

public class UtilMethods {

  // Creates a new Cookie object, and returns it.
  public static Cookie createCookie() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter price (double): ");
    
    double price = input.nextDouble();

    System.out.println("Enter flavor (String): ");

    // input.nextLine() here is called to take in the previous enter, but is not stored anywhere as it is not helpful.
    input.nextLine();
    String flavor = input.nextLine();

    System.out.println("Enter size in inches (double): ");

    double inches = input.nextDouble();

    System.out.println("Enter type of cookie (ex. chocolate chip) (String): ");

    input.nextLine();
    String type = input.nextLine();
    
    input.close();
    
    return new Cookie(price, flavor, inches, type);
  }

  // Creates a new Scone object, and returns it.
  public static Scone createScone() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter price (double): ");
    
    double price = input.nextDouble();

    System.out.println("Enter flavor (String): ");

    // input.nextLine() here is called to take in the previous enter, but is not stored anywhere as it is not helpful.
    input.nextLine();
    String flavor = input.nextLine();

    System.out.println("Enter size in inches (double): ");

    double inches = input.nextDouble();

    System.out.println("Enter height (float): ");

    input.nextLine();
    float height = input.nextFloat();
        
    input.close();
    
    return new Scone(price, flavor, inches, height);
  }

  // Creates a new Cake object, and returns it.
  public static Cake createCake() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter price (double): ");
    
    double price = input.nextDouble();

    System.out.println("Enter flavor (String): ");

    // input.nextLine() here is called to take in the previous enter, but is not stored anywhere as it is not helpful.
    input.nextLine();
    String flavor = input.nextLine();

    System.out.println("Enter size in inches (double): ");

    double inches = input.nextDouble();

    System.out.println("Enter the number of layers (int): ");

    int layerNum = input.nextInt();

    System.out.println("Does the cake have frosting? (boolean)");

    boolean hasFrosting = input.nextBoolean();

    System.out.println("Enter the cake design details (String): ");

    input.nextLine();
    String design = input.nextLine();

    String frostingColor = "N/A";
    
    if (hasFrosting) {
      System.out.println("Enter the frosting color (String): ");
      frostingColor = input.nextLine();
    }
        
    input.close();
    
    return new Cake(price, flavor, inches, layerNum, hasFrosting, design, frostingColor);
  }

  // Creates a new Cupcake object, and returns it.
  public static Cupcake createCupcake() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter price (double): ");
    
    double price = input.nextDouble();

    System.out.println("Enter flavor (String): ");

    // input.nextLine() here is called to take in the previous enter, but is not stored anywhere as it is not helpful.
    input.nextLine();
    String flavor = input.nextLine();

    System.out.println("Enter size in inches (double): ");

    double inches = input.nextDouble();

    System.out.println("Does the cupcake have frosting? (boolean)");

    boolean hasFrosting = input.nextBoolean();

    String frostingColor = "N/A";
    
    if (hasFrosting) {
      System.out.println("Enter the frosting color (String): ");
      input.nextLine();
      frostingColor = input.nextLine();
    }
        
    input.close();
    
    return new Cupcake(price, flavor, inches, hasFrosting, frostingColor);
  }

  // Removes the cookie from the pastries parameter, then returns pastries.
  public static ArrayList<Object> removeCookie(ArrayList<Object> pastries) {
    Scanner input = new Scanner(System.in);

    // Boolean used to determine if there are any cookies that need to be removed
    boolean shouldContinue = false;
    
    for (Object pastry : pastries) {
      if (pastry instanceof Cookie) {
        shouldContinue = true;
      }
    }

    // Returns normally if there are no cookies in pastries.
    if (!shouldContinue) {
      System.out.println("There are no cookies to remove!");
      return pastries;
    }
    
    System.out.println("Which cookie do you want to remove? Use the number next to the cookie you would like to remove: ");

    // Used for the number of Cookie objects that could be removed
    int count = 0;
    
    // Print out all of the cookies
    for (Object pastry : pastries) {
      if (pastry instanceof Cookie) {
        // Make the pastry into a Cookie and print out some attributes.
        Cookie cookieToDelete = (Cookie) pastry;
        count++;
        System.out.println(count + ": $" + cookieToDelete.getPrice() + " " + cookieToDelete.getTypeOfCookie() + " cookie");
      }
    }

    // Asks which index number (count) to remove
    int indexToRemove = input.nextInt();

    // The index of the whole array that is currently being checked.
    int currentIndex = 0;

    // The number of Cookie objects that have been counted.
    count = 0;

    // This is a clever workaround to avoid an error with removing the value from pastries directly.
    ArrayList<Object> pastriesToRemove = new ArrayList<>();

    
    for (Object pastry : pastries) {
      // Check if the object is a cookie, and if so, if it is the one that we need to remove.
      if (pastry instanceof Cookie) {
        if (count == indexToRemove - 1) {
          // Add whichever pastry needs to be removed to pastriesToRemove
          pastriesToRemove.add(pastries.get(currentIndex));
        }
        count++;
      }
      currentIndex++;
    }

    // Remove the pastry that was discarded.
    pastries.removeAll(pastriesToRemove);

    return pastries;
  }

  // Removes the scone from the pastries parameter, then returns pastries.
  public static ArrayList<Object> removeScone(ArrayList<Object> pastries) {
    Scanner input = new Scanner(System.in);

    // Boolean used to determine if there are any cakes that need to be removed
    boolean shouldContinue = false;
    
    for (Object pastry : pastries) {
      if (pastry instanceof Scone) {
        shouldContinue = true;
      }
    }
    
    // Returns normally if there are no scones in pastries.
    if (!shouldContinue) {
      System.out.println("There are no scones to remove!");
      return pastries;
    }
    
    System.out.println("Which scone do you want to remove? Use the number next to the scone you would like to remove: ");

    // Used for the number of Scone objects that could be removed
    int count = 0;
    
    // Print out all of the scones
    for (Object pastry : pastries) {
      if (pastry instanceof Scone) {
        // Make the pastry into a Scone and print out some attributes.
        Scone sconeToDelete = (Scone) pastry;
        count++;
        System.out.println(count + ": " + sconeToDelete.getSize() + " x " + sconeToDelete.getHeight() + " inch, $" + sconeToDelete.getPrice() + " scone");
      }
    }

    // Asks which index number (count) to remove
    int indexToRemove = input.nextInt();

    // The index of the whole array that is currently being checked.
    int currentIndex = 0;

    // The number of Scone objects that have been counted.
    count = 0;

    // This is a clever workaround to avoid an error with removing the value from pastries directly.
    ArrayList<Object> pastriesToRemove = new ArrayList<>();
    
    for (Object pastry : pastries) {
      // Check if the object is a scone, and if so, if it is the one that we need to remove.
      if (pastry instanceof Scone) {
        if (count == indexToRemove - 1) {
          // Add whichever pastry needs to be removed to pastriesToRemove
          pastriesToRemove.add(pastries.get(currentIndex));
        }
        count++;
      }
      currentIndex++;
    }
  
    // Remove the pastry that was discarded.
    pastries.removeAll(pastriesToRemove);

    return pastries;
  }

  // Removes the cake from the pastries parameter, then returns pastries.
  public static ArrayList<Object> removeCake(ArrayList<Object> pastries) {
    Scanner input = new Scanner(System.in);
    
    // Boolean used to determine if there are any cakes that need to be removed
    boolean shouldContinue = false;
    
    for (Object pastry : pastries) {
      if (pastry instanceof Cake) {
        shouldContinue = true;
      }
    }

    // Returns normally if there are no cakes in pastries.
    if (!shouldContinue) {
      System.out.println("There are no cakes to remove!");
      return pastries;
    }
    
    System.out.println("Which cake do you want to remove? Use the number next to the cake you would like to remove: ");

    // Used for the number of Cake objects that could be removed
    int count = 0;
    
    // Print out all of the cakes
    for (Object pastry : pastries) {
      if (pastry instanceof Cake) {
        // Make the pastry into a Cake and print out some attributes.
        Cake cakeToDelete = (Cake) pastry;
        count++;
        System.out.println(count + ": $" + cakeToDelete.getPrice() + " " + cakeToDelete.getFlavor() + " cake");
      }
    }

    // Asks which index number (count) to remove
    int indexToRemove = input.nextInt();

    // The index of the whole array that is currently being checked.
    int currentIndex = 0;

    // The number of Cake objects that have been counted.
    count = 0;

    // This is a clever workaround to avoid an error with removing the value from pastries directly.
    ArrayList<Object> pastriesToRemove = new ArrayList<>();
    
    for (Object pastry : pastries) {
      // Check if the object is a cake, and if so, if it is the one that we need to remove.
      if (pastry instanceof Cake) {
        if (count == indexToRemove - 1) {
          // Add whichever pastry needs to be removed to pastriesToRemove
          pastriesToRemove.add(pastries.get(currentIndex));
        }
        count++;
      }
      currentIndex++;
    }
  
    // Remove the pastry that was discarded.
    pastries.removeAll(pastriesToRemove);

    return pastries;
  }

  // Removes the cupcake from the pastries parameter, then returns pastries.
  public static ArrayList<Object> removeCupcake(ArrayList<Object> pastries) {
    Scanner input = new Scanner(System.in);

    // Boolean used to determine if there are any cupcakes that need to be removed
    boolean shouldContinue = false;
    
    for (Object pastry : pastries) {
      if (pastry instanceof Cupcake) {
        shouldContinue = true;
      }
    }

    // Returns normally if there are no cupcakes in pastries.
    if (!shouldContinue) {
      System.out.println("There are no cupcakes to remove!");
      return pastries;
    }
    
    System.out.println("Which cupcakes do you want to remove? Use the number next to the cupcakes you would like to remove: ");

    // Used for the number of Cupcake objects that could be removed
    int count = 0;
    
    // Print out all of the cupcakes
    for (Object pastry : pastries) {
      // Check if the object is a cupcake, and if so, if it is the one that we need to remove.
      if (pastry instanceof Cupcake) {
        // Make the pastry into a Cupcake and print out some attributes.
        Cupcake cupcakeToDelete = (Cupcake) pastry;
        count++;
        System.out.println(count + ": $" + cupcakeToDelete.getPrice() + " " + cupcakeToDelete.getFlavor() + " cupcake");
      }
    }

    // Asks which index number (count) to remove
    int indexToRemove = input.nextInt();

    // The index of the whole array that is currently being checked.
    int currentIndex = 0;

    // The number of Cupcake objects that have been counted.
    count = 0;

    // This is a clever workaround to avoid an error with removing the value from pastries directly.
    ArrayList<Object> pastriesToRemove = new ArrayList<>();
    
    for (Object pastry : pastries) {
      if (pastry instanceof Cupcake) {
        if (count == indexToRemove - 1) {
          // Add whichever pastry needs to be removed to pastriesToRemove
          pastriesToRemove.add(pastries.get(currentIndex));
        }
        count++;
      }
      currentIndex++;
    }
  
    // Remove the pastry that was discarded.
    pastries.removeAll(pastriesToRemove);

    return pastries;
  }
}
