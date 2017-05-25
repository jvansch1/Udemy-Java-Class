public class Main {
  public static void main(String[] args) {
    int primes = 0;

    for(int i = 872; i < 234234; i++) {
      if (isPrime(i)) {
        System.out.println(i);
        primes++;
      }

      if (primes > 2) {
        break;
      }
    }
  }

  public static boolean isPrime(int number) {

    if (number == 1) {
      return false;
    }

    for(int i = 2; i < number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
