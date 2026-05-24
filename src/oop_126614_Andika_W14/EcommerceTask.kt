package oop_126614_Andika_W14
import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP"     -> basePrice * 0.90
            else      -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION  menulis file langsung di class bisnis
        file.appendText("$itemName,$finalPrice,$customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}