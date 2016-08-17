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
}