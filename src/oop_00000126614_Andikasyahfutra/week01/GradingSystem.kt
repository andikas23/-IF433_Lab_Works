package oop_00000126614_Andikasyahfutra.week01

fun main() {
    val name= "revlog"
    val score= 80
    println( "nama: $name ,nilai: $score")

    val grade= when (score){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println ("grade kamu = $grade")



}

