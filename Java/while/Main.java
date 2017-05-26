public class Main {
  public static void main(String[] args) {
    int number = 293457;
    int evens = 0;
    while (number < 1000000) {
      if (isEvenNumber(number)) {
        System.out.println(number);
        evens++;
      }

      if (evens > 4) {
        break;
      }
      number++;
    }
  }

  public static boolean isEvenNumber(int number) {
    if (number % 2 == 0) {
      return true;
    }
    return false;
  }
}
