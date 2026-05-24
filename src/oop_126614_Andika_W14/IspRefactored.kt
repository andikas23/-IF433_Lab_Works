package oop_126614_Andika_W14

interface Printable {
    fun print(doc: String)
}

interface Scannable {
    fun scan(doc: String): String
}

//implementasi printableee
class ModernSimplePrinter : Printable {
    override fun print(doc: String) = println("Printing securely: $doc")
}