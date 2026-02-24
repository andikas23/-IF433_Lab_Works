package oop_00000126614_Andika_week04

fun main(){
    println("---testing vehicle---")
    val generalVehicle= Vehicle( brand = "sepeda ontel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n --- testing car---")
    val myCar= Car( brand= "toyota", numberOfDoors=4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n=== Testing Electric Car ===")
    val electricCar = ElectricCar("Tesla", 4, 85)

    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

}
