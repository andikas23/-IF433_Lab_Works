package oop_00000126614_Andika_W05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}