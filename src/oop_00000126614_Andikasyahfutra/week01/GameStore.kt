package oop_00000126614_Andikasyahfutra.week01

fun main() {
    val gameTitle = "fantastic four"
    val price = 600000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price * 20 / 100 else price * 10 / 100

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")
}

