package oop_00000126614_Andika_W05

class Admin(nama:String): Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk depan komputer melayani administrasi")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasuswa")
    }
}
