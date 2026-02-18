package oop_00000126614_Andika_week03

class Employee (val name:String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Error:gaji tidak boleh negatif, set ke 0")
                field = 0
            } else {
                field = value
            }
        }
    //hanya bisa diakses private
    private var performanceRating:Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }


    fun printStatus(){
            println("karyawan : $name, rating:$performanceRating")
        }
    val tax: Double
        get() = salary * 0.1

}




