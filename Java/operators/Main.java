
public class Main {
  public static void main(String[] args) {
    double number = 20;
    double numberTwo = 80;
    double sum = (number + numberTwo) * 25;
    double remainder = sum % 40;
    if (remainder <= 20) {
      System.out.println("Total was over the limit");
    }
  }
}
