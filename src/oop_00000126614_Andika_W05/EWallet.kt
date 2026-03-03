package oop_00000126614_Andika_W05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil dengan EWallet, Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup.")
        }
    }
    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil, Saldo sekarang: $balance")
    }
}
