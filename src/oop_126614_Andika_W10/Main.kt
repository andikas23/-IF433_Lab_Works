package oop_126614_Andika_W10

fun main() {
    println("=== TEST GENERIC CLASS ===")

    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice= PairBox("Bitcoin", 65000)
    println("asset: ${itemPrice.key}, harga: ${itemPrice.value}USD")
}