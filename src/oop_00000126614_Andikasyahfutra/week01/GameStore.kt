package oop_00000126614_Andikasyahfutra.week01

fun main() {
    val gameTitle = "fantastic four"
    val price = 600000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
    val userNote: String? = null


    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
                note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) price * 20 / 100 else price * 10 / 100

fun printReceipt(title: String, finalPrice: Int,note: String?) {
    println("Judul Game: $title")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: ${note ?: "Tidak ada catatan"}")
}

