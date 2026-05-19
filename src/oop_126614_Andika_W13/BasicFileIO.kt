package oop_126614_Andika_W13

import java.io.File
fun main() {
    println("=== TEST WRITE TEXT ===")
    val file=File("notes.txt")
    file.writeText("line1: inisiasi sistwm .\n")
    println("file berhasil dibuat dan ditulis")
    file.appendText("line2: menambahkan konfigurasi baru.\n")
    println("Teks berhasil di append.")

    println("\n=== TEST READ TEXT ===")
    val fullContent = file.readText()
    println("membaca sekaligus: \n $fullContent")
    println("===TEST READ LINES")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("isi index $index: $line")
    }
}


