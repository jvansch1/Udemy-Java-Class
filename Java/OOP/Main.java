
public class Main {
  public static void main(String[] args) {
    Car porsche = new Car();
    Car toyota = new Car();
    porsche.setModel("911");
    toyota.setModel("Corolla");
    System.out.println(porsche.getModel());
    System.out.println(toyota.getModel());
  }
}
