package oop_00000126614_Andikasyahfutra_week2

class Student (
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0)


{
init {
    if (nim.length !=5) {
        println("WARNING:objek tercipta dengan ($nim) yang tidak valid!")
        println("data mahasiswa $name mungkin akan bermasalah di sistem ")
    } else {
        println ("LOG : objek student $name berhasil dialokasikan di memory.")
    }

}
    //secondary constructor
    // wajib memanggil pramary constructor menggunakan this
    constructor (name: String,nim: String, gpa:Double): this (name, nim, major="Non-Matriculated", gpa){
        println("LOG : menggunakan constructor jalur umum (tanpa jurusan)")
    }
}





