package oop_Andika_w08teori

fun main() {
    var nama: String? = null

    try {
        println("nama kamu ${nama!!.uppercase()}")
    } catch (ex: Exception) {
        println("errornya adalah ${ex.message}")
    }
    var dataMhs: List<Any> = listOf(123, "wirawan", 89, "tangerang")
    for (item in dataMhs) {
        var itemFilter = item as? String
        if (itemFilter != null) {
            println(itemFilter)
        }
    }
}