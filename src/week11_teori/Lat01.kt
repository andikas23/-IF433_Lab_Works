package week11_teori

//function biasa
fun panggil_nama (nama:String):String{
    return "hai $nama"
}

//extension function
fun String.panggil_mahasiswa():String{
//    return "hello $this"
    var hasil= this.split( "").joinToString(  ""){
     it.replaceFirstChar{
         c->c.uppercase()
     }
    }
    return hasil
}

//function extension - parameter
fun Int.tentukanLulus(nama:String):String{
    var keputusan=""
    if(this >=70){
        keputusan="lulus"
    }
    return "mahasiswa $nama hasil kelulusan adalah $keputusan"
}

//function extension -cek null
fun String?.cekNulldanEmpty(): String{
    if (this == null || this.isEmpty()) {
        return "gaboleh null/ kosong bang"
    } else{
        return "username kamu adalah $this"
    }
}
class Mahasiswa(){
    var nim:String = ""
    var nama:String = ""
    var ipk:Int = 0
}
fun main(){
//    cara panggil function extension
    var inputUsername:String?=null
    println(inputUsername.cekNulldanEmpty())

//    cara panggil function extension yang pake parameter
    println(80.tentukanLulus("revan"))

//    cara manggil function biasa
    println(panggil_nama("toni").uppercase())

//    cara panggil function extension
    println("tonyy stark iron man".panggil_mahasiswa())
//   SCOPE -LET
    var kampusSaya="UMN"
    kampusSaya.let{
        if(it=="UMN"){
        println("Kampus"+it+"keren")
    }else  {
        println("amazing"+it)
        }


//    SCOPE -RUN
    var alamatSaya="Gading serpong"
    alamatSaya.run{
        println("saya tinggal di" +this)
    }
    }
//        SCOPE -WITH
    var gradeSaya=with(90){
        if(this>=80){
            "A"
        }else if (this>=70){
            "B"
        }else {
            "C"
        }
    }
    println("grade kamu adalah $gradeSaya")

//    SCOPE -APLLY
    var dataMahasiswa=Mahasiswa().apply{
        nama="yudi"
        nim="12345"
        ipk=3
    }
println("mahasiswa ${dataMahasiswa.nama}dgn nim ${dataMahasiswa.nim} ipk nya ${dataMahasiswa.ipk}")

//    SCOPE -ALSO
    var deretAngka=mutableListOf<Int>(80,70,75,68,85)
    deretAngka.also {
        println("sebelum $deretAngka")
    }.add(90)
    println("setelah $deretAngka")
}