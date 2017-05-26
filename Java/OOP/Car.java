

// public is an access modifier
// unrestricted access to class
public class Car {
  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String color;

  public void setModel(String modelName) {
    this.model = modelName;
  }

  public String getModel() {
    return this.model;
  }
}
