package oop_Andika_W12_TEORI
// try catch fungsinya untuk menangkap error
fun pembagian ( pembilang: Int, penyebut : Int){
    try{
    val hasilBagi=pembilang/penyebut
    println("hasil bagi: $hasilBagi")
    } catch(e:Exception){
        println("Error di pembagian: ${e.message}")
    } finally {
        println("selesai pembagian")
    }
}

// exception - expression - tipe data
fun cek_tipe_data(){
    var angka:Int = try{
        Integer.parseInt("10")
    } catch(e:Exception){
        println("ada error di cek tipe data ${e.message}")
        111
    }
    println("angka kamu adalah ${angka}")
}


//THROW
fun cek_saldo(saldoSaya:Int){
    if(saldoSaya<1000){
        throw IllegalArgumentException("Saldo ${saldoSaya} tidak perlu bayar pajak")
    } else {
        println("selamaat kamu orang kaya")
    }
}


//custom exception
class CekNilaiKKM(val kkm:Int , val nilai:Int): Exception ("nilai $nilai berada dibawah kkm $kkm")

class nilai_siswa( val kkm:Int){
    fun  input_nilai ( nilaiKamu:Int){
        if(nilaiKamu<kkm){
            throw CekNilaiKKM(kkm, nilaiKamu)
        }else {
            println("kamu lulus dengan nilai $nilaiKamu")
        }
    }
}

//MULTIPLE CATCH
fun contoh_multiple_catch(nilai:String){
    try{
        val angka:Int= Integer.parseInt(nilai)
        val hasil:Int = angka/2
        println("hasil nilainya :$hasil")
    } catch(e:NumberFormatException){
        println("error salah format ${e.message}")
    }catch(e:ArithmeticException){
        println("error kesalahan aritmetika ${e.message}")
    } catch(e:Exception){
        println("error program ${e.message}")
    }
}

sealed class ATMException(pesan:String): Exception(pesan)
class saldo_dibawah_nol(val saldoKamu:Int)
class cek_jumlah_saldo(val saldoAwal:Int,val jajan:Int)
fun main(){

    contoh_multiple_catch( "50")

    //panggil class custom exception
    val nsiswa=nilai_siswa(70)
    try{nsiswa.input_nilai(71)
    } catch (e:Exception){
        println("Ada error saat input nilai ${e.message}")
    }


    //coba throw
    try{
        cek_saldo(900)
    }catch (e:Exception){
        println("error di throw : ${e.message}")
    }


    //exception - expression
    cek_tipe_data()


    pembagian ( 10,0)
}