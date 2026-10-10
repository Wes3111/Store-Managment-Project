import java.util.Scanner;

//Tests the store management system.
public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
//Create shirts using parameterized constructors.
    Shirt shirt1 = new Shirt("T-Shirt", 19.99, 20, "Large");
    Shirt shirt2 = new Shirt("Hoodie", 39.99, 10, "Medium");

//Create shoes using parameterized constructors.
    Shoes shoes1 = new Shoes("Sneakers", 59.99, 15, 10);
    Shoes shoes2 = new Shoes("Running Shoes", 79.99, 8, 9);

//Create objects using no-argument constructors.
    Shirt shirt3 = new Shirt();
    Shoes shoes3 = new Shoes();

//Print all products.
    System.out.println("CLOTHING STORE");
    System.out.println("--------------");
    System.out.println(shirt1);
    System.out.println(shirt2);
    System.out.println(shoes1);
    System.out.println(shoes2);
    System.out.println(shirt3);
    System.out.println(shoes3);

//Update a shirt using mutator methods.
    shirt1.setPrice(24.99);
    shirt1.setQuantity(18);
    shirt1.setSize("Small");

//Print the updated shirt.
    System.out.println();
    System.out.println("UPDATED SHIRT");
    System.out.println(shirt1);
    
//Use accessor methods.
    System.out.println();
    System.out.println("PRODUCT DETAILS");
    System.out.println("Name: " + shoes1.getName());
    System.out.println("Price: $" + shoes1.getPrice());
    System.out.println("Quantity: " + shoes1.getQuantity());
    System.out.println("Shoe Size: " + shoes1.getShoeSize());
    
//Close the Scanner
    input.close();

    
  }
}