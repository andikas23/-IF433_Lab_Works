package oop_00000126614_Andika_w06

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil di klik!")
    }
}