package oop_126614_Andika_W14
import java.io.FileWriter

//  Fix SRP abstraksi penyimpanannn
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        FileWriter("orders.csv", true).use { writer ->
            writer.appendLine("$itemName,$finalPrice,$customerType")
        }
        println("Order tersimpan ke CSV: $itemName")
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}
class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}