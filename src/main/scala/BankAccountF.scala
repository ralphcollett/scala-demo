
case class BankAccountF(balance: Int)

object BankAccountF {

  def deposit(account: BankAccountF, depositAmount: Int): BankAccountF = {
    BankAccountF(account.balance + depositAmount)
  }

  def withdraw(account: BankAccountF, depositAmount: Int): BankAccountF = {
    BankAccountF(account.balance - depositAmount)
  }

  def inTheRed(account: BankAccountF) = account.balance < 0
}
