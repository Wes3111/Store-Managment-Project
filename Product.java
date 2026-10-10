//Represents a product sold in the store.
public class Product {
  private String name;
  private double price;
  private int quantity;

  // Creates a product with default values.
  public Product() {
    name = "Unknown";
    price = 0.0;
    quantity = 0;
  }

  //Creates a product with given values.
  public Product(String name, double price,int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  //Returns the product name.
  public String getName() {
    return name;
  }

  //Sets the product name.
  public void setName(String name) {
    this.name = name;
  }

  //Returns the product price.
  public double getPrice(){
    return price;
  }
  
  //Sets the product price.
  public void setPrice(double price) {
    this.price = price;
  }

  //Returns the quantity in stock.
  public int getQuantity() {
    return quantity;
  }

  //Sets the quantity in stock.
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }

  //Returns the product information.
  public String toString() {
    return "Name: " + name + ", Price: $" + price + ", Quantity: " + quantity;
  }
}