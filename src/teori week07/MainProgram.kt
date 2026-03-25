package `teori week07`

fun main (){
    println("server:${Koneksi.linkServer}")
    Koneksi.test_koneksi();

    Mahasiswa.nama="udin"
    val na : Int =Mahasiswa.set_nilai(uts=80, uas=100)
    println("nilai ${Mahasiswa.nama} adalah $na");

    Mahasiswa.isi_nama_kampus("UI")
    val dsn1=Dosen(nama="indah", nik= "12345", 2020)
    println(dsn1);
    val dsn2= dsn1.copy(nama="budi",nik="3214")
    println(dsn2)

//    cara ambil data satu persatu
    println("nama dosen1=${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}")

    println ("matkul fav saya" + MataKuliah.OOP.name)
    println ("index matkul" + MataKuliah.OOP.ordinal)
    MataKuliah.OOP.sks_matkul()


//    looping munculin semua
    for(matkul in MataKuliah.entries){
        print("matkul :"+ matkul+ "")
        matkul.sks_matkul()
    }
}