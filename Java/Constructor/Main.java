public class Main {
  public static void main(String[] args) {
    Bank account = new Bank(76234, 10000, "akjsdflhj", "aksdhlkfajsh", "aksjdhflakjshd");
    System.out.println(account.getBalance());
    account.deposit(5000);
    System.out.println(account.getBalance());
    account.withdraw(16000);
    System.out.println(account.getName());
  }
}
