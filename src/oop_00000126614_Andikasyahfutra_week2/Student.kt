package oop_00000126614_Andikasyahfutra_week2



class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0
) {

    init {
        if (nim.length != 5) {
            println("WARNING: objek tercipta dengan ($nim) yang tidak valid!")
        } else {
            println("LOG: objek student $name berhasil dialokasikan di memory.")
        }
    }

    // Secondary constructor (jalur umum)
    constructor(name: String, nim: String)
            : this(name, nim, "Non-Matriculated") {

        println("LOG: menggunakan constructor jalur umum (tanpa jurusan)")
    }
}
