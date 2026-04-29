package oop_teori_w10

class rumah( val alamat:Any)
class kampus<T>(val alamat:T)


//code geenric -multi parameter
class komputer<T>(val merk:T,val barcode:T)


// code generic - Function
fun<T> Password (isiPass:T):T{
    return isiPass
}


//CODE GENERIC - FUNCTION&CONSTRAINT
class kalkulator<T:Number>(val a:T, val b:T){
    fun tambah(): Int {
        return a.toInt() + b.toInt()
    }
    fun kurang(): Double{
        return a.toDouble() - b.toDouble()
    }
}

//generic -Where
fun <T> penilaian (list:List<T>, kkm:T):List<T> where T: Comparable<T>{
    return list.filter {it >= kkm}
}


fun main(){

    println("=== Generic where ===")
    val daftarNilai = listOf(60,71,90,83,73,67,55,84,72)
    println("daftar nilai"+daftarNilai)
    val nilaiAtasKKM = penilaian (daftarNilai, 70)
    println("nilai diatas kkm"+nilaiAtasKKM)


    println("=== Generic constrain ===")
    val kalk = kalkulator(10.52,20.347)
    println("penambahan ${kalk.a} ditambah ${kalk.b}:" + kalk.tambah())
    println("pengurangan ${kalk.a} dikurang ${kalk.b}:" + kalk.kurang())



    println("=== Generic - function ===")
    println("password kamu:" + Password ( 12345))



    println("=== SAMPLE GENERIC - MULTI PARAMETER ===")
    val komp= komputer("dell", 12345)
    println("merk komputer:" + komp.merk)
    println("barcode komputer: ${komp.barcode}")


    println("=== SAMPLE NON GENERIC")
    val rmh=rumah(alamat= 200)
    val angkaRumah= rmh.alamat as Int
    println(angkaRumah+50)


    println("=== sample generic")
    val kmps= kampus( alamat= 300)
    println(kmps.alamat+50)
}

