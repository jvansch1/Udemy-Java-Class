
public class Main {
  public static void main(String[] args) {
    checkNum(5);
  }

  public static void checkNum(int number) {
    switch(number) {
      case 1:
        System.out.println("Its 1");
        break;
      case 2:
        System.out.println("Its 2");
        break;
      case 3: case 4: case 5:
        System.out.println("Between three and five");
        break;
      default:
      System.out.println("what???");
    }
  }
}
