public class Bank {
  private int accountNumber;
  private int balance;
  private String name;
  private String email;
  private String phoneNumber;

  public Bank(int accountNumber, int balance, String name, String email, String phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public void setAccountNumber(int number) {
    this.accountNumber = number;
  }

  public int getAccountNumber() {
    return this.accountNumber;
  }

  public void setBalance(int newBalance) {
    this.balance = newBalance;
  }

  public int getBalance() {
    return this.balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void deposit(int deposit) {
    this.balance = this.balance + deposit;
  }

  public void withdraw(int withdrawel) {
    if (this.balance < withdrawel) {
      System.out.println("Insufficient funds");
    } else {
      this.balance = this.balance = withdrawel;
    }
  }


}
