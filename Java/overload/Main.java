
public class Main {
  public static void main(String[] args) {
    System.out.println(calcFeetAndInchesToCentimeters(6, 0));
    System.out.println(calcFeetAndInchesToCentimeters(72));
  }

  public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
    if (feet < 0 || (inches < 0 || inches > 11)) {
      return -1;
    }
    double feetToInches = feet * 12;
    double TotalInches = feetToInches + inches;
    double cm = TotalInches * 2.54;
    return cm;
  }

  public static double calcFeetAndInchesToCentimeters(int inches) {
    if (inches < 0) {
      return -1;
    }
    int newfeet = inches / 12;
    int leftoverInches = inches % 12;
    return calcFeetAndInchesToCentimeters(newfeet, leftoverInches);
  }
}
