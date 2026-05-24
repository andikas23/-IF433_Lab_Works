package oop_126614_Andika_W13teori
import java.io.BufferedReader
import java.io.File
import java.io.FileReader


data class Mahasiswa(val nim:String, val nama:String, val nilai:Int){
    fun simpanDanConvertCSV(): String {
        return "$nim,$nama,$nilai"
    }
}

fun main(){

    println("=== Cara 2 BUAT FILE === ")
    val mhs= Mahasiswa ("111", "andika", 84)

    // banyak
    val listMhs:List<Mahasiswa> = listOf(
        Mahasiswa("111", "andika", 83),
        Mahasiswa("222", "yoga",86),
        Mahasiswa("333", "revand", 85)
    )

    //simpan ke file
    val file5 = File("src/oop_126614_Andika_W13teori/data_rahasia_mahasiswa.txt")
    file5.writeText(listMhs.joinToString("\n")){
        it.simpanDanConvertCSV()
    }

    println("=== Cara 1 baca isi file === ")
    val file1= File ( "src/oop_126614_Andika_W13teori/contohfile.txt")
    val isiContent=file1.readText()
    println(isiContent)

    println("\n=== cara2 - baca isi dan file")
    val contentSaya= file1.readLines()
    contentSaya.forEach {
        println(it)
    }

    println("\n=== cara3 - baca isi dan file === buffered reader===")
    val file2= BufferedReader( FileReader( "src/oop_126614_Andika_W13teori/contohfile.txt"))
    var isiFile:String?=file2.readLine()
    while(isiFile!=null){
        println(isiFile)
        isiFile=file2.readLine()
    }
    file2.close()

    println("\n=== cara4 - baca isi dan file === buffered reader===")
    val file3 = File( "src/oop_126614_Andika_W13teori/contohfile.txt").bufferedReader()
    file3.use {
        it.lineSequence()
            .filter { it.isNotEmpty() }
            .forEach {println(it)}



        println("\n=== cara1 - BUAT FILE ===")
        val fileSaya=File( "src/oop_126614_Andika_W13teori/fileDataSaya.txt" )
        fileSaya.writeText(" saya suka kepasar \n beli buah  ")

        fileSaya.appendText("\n untuk ayah dan ibu \n untuk kakak dan adik")

        val listBelanjaan = listOf("ayam","pisang", "beras")
        fileSaya.appendText("\n"+listBelanjaan.joinToString("\n"))

        fileSaya.printWriter().use {
            it.println("saya kuliah di UMN")
            it.println("UMN kampus keren")
            it.println("SAYA jurusan IF")
        }


    }
}
