package oop_126614_week6

interface Organisasi {
    var namaOrg: String;
    val budgetRapat: Int;
    val jmlOrg: Int;
    val biayaKonsumsi: Int
    get() = budgetRapat* jmlOrg;


    fun rapat();
    fun keaktifan(){
        println("ih kamu aktif");
    }
}
