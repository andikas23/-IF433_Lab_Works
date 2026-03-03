package oop_00000126614_Andika_W05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------------")
    }
    println("===== TEST OVERLOADING =====")

    val mathHelper = MathHelper()

    println("Luas Persegi: ${mathHelper.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${mathHelper.hitungLuas(5, 3)}")
    println("Luas Lingkaran: ${mathHelper.hitungLuas(7.0)}")

    println("===== PAYMENT SYSTEM =====")

    val ewallet = EWallet("Andika", 50000.0)
    val creditCard = CreditCard("Andika", 100000.0)

    val metodePembayaran: List<PaymentMethod> = listOf(ewallet, creditCard)

    for (metode in metodePembayaran) {

        metode.processPayment(75000.0)

        if (metode is EWallet) {
            println("Saldo kurang, melakukan top up otomatis...")
            metode.topUp(50000.0)
            metode.processPayment(75000.0)
        }

        println("-------------------")
    }}