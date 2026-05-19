package oop_126614_Andika_W13

import java.io.File
fun main() {
    println("=== TEST WRITE TEXT ===")
    val file=File("notes.txt")
    file.writeText("line1: inisiasi sistwm .\n")
    println("file berhasil dibuat dan ditulis")
}