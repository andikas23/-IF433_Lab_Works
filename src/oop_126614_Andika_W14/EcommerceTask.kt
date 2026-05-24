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

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double) = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double) = price * 0.90
}
class SafeOrderProcessor(
    val repo: OrderRepository,
    val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricing: PricingStrategy) {
        val finalPrice = pricing.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, pricing::class.simpleName ?: "unknown")
        notifier.sendNotification(itemName)
    }
}

