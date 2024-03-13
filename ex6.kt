// 6. Crie uma classe "ContaBancaria" com os atributos "saldo" e "limite". Adicione um método chamado "saque" que recebe um valor como parâmetro e subtrai do saldo da conta. Se o valor do saque for maior que o saldo da conta, o método deve lançar uma exceção com a mensagem "Saldo insuficiente". 

class BankAccount(var balance: Double, var overdraftLimit: Double) {
    
    fun withdraw(amount: Double) {
        if (amount > balance + overdraftLimit) {
            throw IllegalArgumentException("Insufficient balance")
        } else {
            balance -= amount
        }
    }
}

fun main() {
    val bankAccount = BankAccount(1000.0, 1000.0)
    println(bankAccount.balance)
    try {
        bankAccount.withdraw(200.0)
        println(bankAccount.balance)
    } catch(e: IllegalArgumentException) {
        println(e)
    }
}
