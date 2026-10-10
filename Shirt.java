//Represents a shirt sold in the store.
public class Shirt extends Product {
  private String size;

  //Creates a shirt with default values.
  public Shirt() {
    super();
    size = "Medium";
  }

  //Creates a shirt with given values.
  public Shirt(String name, double price, int quantity,String size) {
    super(name, price, quantity);
    this.size = size;
  }

  //Returns the shirt size.
  public String getSize() {
    return size;
  }

  //Sets the shirt size.
  public void setSize(String size) {
    this.size = size;
  }

  //Returns the shirt information.
  public String toString() {
    return super.toString() + ", Size: " + size;
  }
}