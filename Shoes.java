//Represents shoes sold in the store.
public class Shoes extends Product {
  private int shoeSize;

  //Creates shoes with default values.
  public Shoes() {
    super();
    shoeSize = 8;
  }

  //Creates shoes with given values.
  public Shoes(String name, double price, int quantity,int shoeSize) {
    super(name, price, quantity);
    this.shoeSize = shoeSize;
  }

  //Returns the shoe size.
  public int getShoeSize() {
    return shoeSize;
  }

  //Sets the shoe size.
  public void setShoeSize(int shoeSize) {
    this.shoeSize = shoeSize;
  }

  public String toString() {
    return super.toString() + ", Shoe Size: " + shoeSize;
  }
}