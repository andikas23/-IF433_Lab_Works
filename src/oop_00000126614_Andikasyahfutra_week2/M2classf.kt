package oop_00000126614_Andikasyahfutra_week2
class Pemain{
    var nama: String = "tidak terdaftar";
    var speed:Int = 9;
    val shoot :Int = 8;

//    inisialisasi primary constructor
    init{
        nama ="messi"
        println("ini adalah constructor")
    }

    constructor (alias: String="Budi", Kecepatan:Int=2):this(alias="udin", Kecepatan=5) {
        nama= alias;
        speed= Kecepatan;
        println("ini constructor kedua");
    }
    fun bawa_bola() {
        println(" si $nama sedang Bawa Bola")

    }
}

fun main() {

    val player = Pemain(alias = "yoel", Kecepatan = 100)

    player.bawa_bola()
//    buat nge set
    player.nama = "andiva"
    println("nama pemain: ${player.nama}")
    println("skill kecepatan: ${player.speed}")

    val player2 = Pemain( alias="ronaldo", Kecepatan = 99);
    println("Pemain Populer:${player2.nama}");
//    println ("kecepatan: " + player2.speed);

//visibility and notation syntax
//+=public
//-=private





