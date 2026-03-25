package oop_126614_week6

class Mahasiswa(
    override var namaOrg: String,
    override val budgetRapat:Int,
    override val jmlOrg: Int,
    override var namaMk: String,
    override val nilaiMk: Int
) : Organisasi, KelasMk {
    override fun rapat(){
        println("sedang rapat di $namaOrg")
        println("biaya konsum rapat: ${super.biayaKonsumsi}")
    }

    override fun keaktifan() {
        super<KelasMk>.keaktifan();
        super<Organisasi>.keaktifan();
    }

    override fun penilaian(){
        println("nilai $namaMk adalah $nilaiMk");
    }


}