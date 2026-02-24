package oop_00000126614_Andika_week04

open class Car(brand: String , val numberOfDoors:Int) :Vehicle(brand){
    fun openTrunk(){
        println("bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }
        override fun honk() {
            println("Tiiin tiiin! mobil $brand lewat")
        }
    override fun accelerate(){
        super.accelerate()
        println("mobil $brand menambah transmisi gigi untuk menambah kecepatan")
    }

}