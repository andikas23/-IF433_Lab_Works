package week09_Teori

fun main(){
    println("===== LIST OF IMMMUTABLE =====")
    val arSiswa= listOf("Budi","danu","suci","cica")
    // view
    println(arSiswa)

    //panjang array
    println("banyak siswa:" + arSiswa.size)

    //munculin satu orang saja
    println("siswa bernama ${ arSiswa[1]}")

    //munculin semua orang gunakan ->for each
    for(a in arSiswa){
        print("siswa"+a+"dan")
    }

    println("====LIST OF MUTABLE =====")
    val arMatkul = mutableListOf("OOP","Pemweb","matdis","kalkulus")
    arMatkul.add("algo")  //buat nambahin array
    arMatkul[2]="aljabar linear"    //buat edit array
    arMatkul.remove("pemweb")    //buat ngapus array
    println(arMatkul)

    println("==== SET OF IMUT ===")
    val arNilai = setOf(80,90,75,85,80,80,30,50,85) // kalo set of yang duplicate bakal dihilangkan
    println("banyak nilai: ${arNilai.size}")
    println("ada angka 90 gak? ${arNilai.contains(90)}")
    println(arNilai)

    println("==== SET OF MUTABLE =====")
    val arMahasiswa = mutableSetOf("andi","yanto","udin","yuda")
    arMahasiswa.add("yanti")
    arMahasiswa.remove("udin")
    arMahasiswa.add("udin")
    println(arMahasiswa)


    println("==== MAP IMUT =====")
    val arResto= mapOf(
        "ayam" to 5000,
        "bakpao" to 3000,
        "sayur asem" to 2500
    )
    println("banyak menu ${arResto}")
    println("harga ayam ${arResto["ayam"]}")
    println("list makanan : ${arResto.keys}")
    println("list harga: ${arResto.values}")
    println(arResto)


    println("==== MAP MUTABLE =====")
    val arKHS =  mutableMapOf(
        "toni" to 80,
        "nika" to 85,
        "Ara" to 87,
        "davin" to 90
        )
    arKHS.remove("Ara")
    arKHS["Nika"]=92
    arKHS["cinta"]=99    // nambahin
    println(arKHS)

    println("==== LAMBDA =====")
    //function biasa
    fun tambah(a:Int,b:Int):Int{
        return a+b
    }
    println ("hasil penambahan ${tambah(5,3)}")

    //function lambda ->tulisnya harus kesamping
    val kurang={a:Int,b:Int->a-b}
    println("hasil pengurangan ${kurang(5,3)}")


    println("==== LAMBDA {IT} =====")
    val pangkat = {a:Int,b:Int->a*a}
    val hasilPangkat :(Int)-> Int = {it*it}
    println("hasil pangkat ${hasilPangkat(5)}")


    println("==== FOREACH BIASA =====")
    for (a in arMatkul) {
        println(a)
    }

    println("==== FOREACH IT =====")
    arMatkul.forEach{
        println(it)
    }

    println("==== FOREACH VARIABEL =====")
    arMatkul.forEach{
        mk->println(mk)
    }

}