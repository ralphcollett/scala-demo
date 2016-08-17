public class BankAccountOO {

  private int balance;

  public BankAccountOO(int initialBalance) {
    this.balance = initialBalance;
  }

  public void deposit(int amount) {
    balance += amount;
  }

  public void withdraw(int amount) {
    balance -= amount;
  }

  public int getBalance() {
    return balance;
  }

  public static void main(String[] args) {
    BankAccountOO account = new BankAccountOO(32);
    account.withdraw(20);
    System.out.println("account.getBalance() = " + account.getBalance());
  }
}