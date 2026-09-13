package Day06

class BankAccount(val accountHolder: String, private var balance: Double = 0.0) {

    // Deposit only positive amounts
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount successfully.")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    // Withdraw only if amount is positive and sufficient balance exists
    fun withdraw(amount: Double) {
        if (amount <= 0) {
            println("Withdrawal amount must be positive.")
        } else if (amount > balance) {
            println("Insufficient balance. Transaction failed.")
        } else {
            balance -= amount
            println("Withdrew $$amount successfully.")
        }
    }

    // Getter function to safely check the balance
    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount("Lokesh", 500.0)

    println("Account Holder: ${account.accountHolder}")
    println("Initial Balance: $${account.getBalance()}")

    // Testing Deposit
    account.deposit(200.0)
    account.deposit(-50.0) // Invalid

    // Testing Withdrawal
    account.withdraw(150.0)
    account.withdraw(600.0) // Invalid (Insufficient)
    account.withdraw(-20.0) // Invalid

    println("Final Balance: $${account.getBalance()}")
}
