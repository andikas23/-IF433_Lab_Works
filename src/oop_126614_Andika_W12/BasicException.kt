package oop_126614_Andika_W12

import java.text.NumberFormat

fun divide (a:Int , b: Int): Int{
    try{
        return a / b
    } catch (e:ArithmeticException){
        println("Error: ${e.message}")
        return -1
    }finally {
        println("Division attempt finished")
    }
}

fun main (){
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"
    //try langsung mengembalikan hasil parsing
    val result : Int = try{
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException){
        -1
    }
    println("Hasil parsing :$result")
}