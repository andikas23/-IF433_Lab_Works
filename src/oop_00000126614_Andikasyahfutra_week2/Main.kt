package oop_00000126614_Andikasyahfutra_week2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")
    print("Masukkan Nama: ")
    val name = scanner.nextLine()
    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.nextLine()
    if (nim.length != 5) {
        println("Error: NIM harus 5 karakter!")
        return
    }


    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // memanggil Primary Constructor
        val s1 = Student(name, nim, major)

        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        // memanggil Secondary Constructor
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
    println("\n=== SISTEM PEMINJAMAN BUKU ===")

    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("Detail Peminjaman:")
    println("Judul: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")


    fun main() {
        val scanner = Scanner(System.`in`)
        println("--- APLIKASI PMB UMN ---")
        print("Masukkan Nama: ")
        val name = scanner.nextLine()
        print("Masukkan NIM (Wajib 5 Karakter): ")
        val nim = scanner.nextLine()
        if (nim.length != 5) {
            println("Error: NIM harus 5 karakter!")
            return
        }


        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1) {
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            // memanggil Primary Constructor
            val s1 = Student(name, nim, major)

            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            // memanggil Secondary Constructor
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
        println("\n=== SISTEM PEMINJAMAN BUKU ===")

        print("Judul Buku: ")
        val title = scanner.nextLine()

        print("Nama Peminjam: ")
        val borrower = scanner.nextLine()

        print("Lama Pinjam (hari): ")
        var duration = scanner.nextInt()
        scanner.nextLine()

        if (duration < 0) {
            duration = 1
        }

        val loan = Loan(title, borrower, duration)

        println("Detail Peminjaman:")
        println("Judul: ${loan.bookTitle}")
        println("Peminjam: ${loan.borrower}")
        println("Durasi: ${loan.loanDuration} hari")
        println("Total Denda: Rp ${loan.calculateFine()}")

    }

    println("\n=== MINI RPG BATTLE ===")

    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val damage = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("\n1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val action = scanner.nextInt()
        scanner.nextLine()

        if (action == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh menyerang balik!")
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }

        } else {
            println("Kamu kabur dari pertarungan!")
            break
        }
    }

    println("\n=== HASIL PERTARUNGAN ===")
    if (hero.isAlive() && enemyHp == 0) {
        println("${hero.name} MENANG!")
    } else if (!hero.isAlive()) {
        println("Hero kalah...")
    } else {
        println("Pertarungan dihentikan.")
    }



}



