package oop_00000126614_Andikasyahfutra_week2

import java.util.Scanner
fun main (){
    val scanner = Scanner(System.`in`)
    println ("Aplikasi --- PMB UMN ---")
    print("masukan nama")
val name = scanner.nextLine()
    print ("Masukan NIM (Wajib 5 karakter):")
    val nim = scanner.next()
    scanner.nextLine ()
    if (nim.length!=5){
        println ("error:pendaftaran dibatalkan (NIM harus 5 karakter!")

    } else {
        print ("masukan jurusan:")
        val major = scanner.nextLine()

        val s1 =student(name, nim,  major)
        println("status: Pendaftaran Selesai")
    }
}