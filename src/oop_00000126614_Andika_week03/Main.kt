package oop_00000126614_Andika_week03

fun main(){
    val e = Employee("budi")

    //test salary
    e.salary=-1000
    e.salary=5000000
    println("gaji : ${e.salary}")

    //2.encapsulation
    e.increasePerformance()
    println("pajak yang harus dibayar: ${e.tax}")

}