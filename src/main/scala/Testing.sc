val account = BankAccountF(12)

import BankAccountF._

import scala.util.Try

deposit(account, 12)

val tennerBonus =
  (acc: BankAccountF) => deposit(acc, 10)

tennerBonus(account)

val accounts = Set(BankAccountF(12),
  BankAccountF(10), BankAccountF(-10))

val accounts2 = accounts.map(tennerBonus)

accounts2.filter(inTheRed)

case class User(name: String, emailAddresses: Set[String])

val users = Set(User("Bob", Set("bob@a.com", "bob@b.com")),
  User("Alice", Set("alice@a.com")),
  User("Fred", Set.empty))

users.flatMap((user) => user.emailAddresses)

def toInt(string: String) = Try(string.toInt).toOption

toInt("a")
toInt("1")
toInt("123")

Set("1", "a", "123").flatMap(toInt)