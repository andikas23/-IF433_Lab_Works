package oop_00000126614_Andika_week03

fun main(){
    val e = Employee("budi")

    //test salary
    e.salary=-1000
    e.salary=5000000
    println("gaji : ${e.salary}")


    e.increasePerformance()
    println("pajak yang harus dibayar: ${e.tax}")

    val sword = Weapon("Excalibur", 300)

    sword.damage = -50
    println("Damage sekarang: ${sword.damage}")
    sword.damage = 9999
    println("Damage sekarang: ${sword.damage}")
    println("Tier senjata: ${sword.tier}")

    println("================================")
    println("PLAYER TEST")

    val player = Player("Andika")

    player.addXp(50)
    println("Level sekarang: ${player.level}")

    player.addXp(60)
    println("Level sekarang: ${player.level}")

}