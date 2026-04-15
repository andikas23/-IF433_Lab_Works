package oop_Andika_w08teori

class Alamat(val nomor:Int, val kota: String)
class Mahasiswa (val nim:String, val addr: Alamat?)

fun main(){
  val almt = Alamat ( nomor= 47, kota = "Tangerang")
    val mhs = Mahasiswa(nim="12345", almt)

    val defaultAlamat = mhs.addr?.let{
       alamatAsli -> "sini nih... ${mhs.addr.kota} nomornya ${mhs.addr.nomor}"
    }?: "gak jelas, ga tau dimana"

    println ("Nim-nya ${mhs.nim} tinggalnya di ${defaultAlamat}")
}