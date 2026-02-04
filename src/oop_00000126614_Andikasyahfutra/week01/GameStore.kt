package oop_00000126614_Andikasyahfutra.week01

fun main() {
    val gameTitle = "fantastic four"
    val price = 600000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}
fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price * 20 / 100 else price * 10 / 100
