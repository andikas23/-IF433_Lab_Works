package oop_Andika_w08teori

class SetKrs(val nim: String, val kodematkul: String?) {
    fun matkul_wajib(sks: Int?) {
        println("matkul kamu adalah $kodematkul sks-nya adalah $sks")
    }
}
fun main() {
    var nama: String? = "dimas"
    nama = null
    println("hai $nama")
    val settingKRS = SetKrs(nim = "123", kodematkul = null)
    println("Nim kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}")
    settingKRS. matkul_wajib(null);
}