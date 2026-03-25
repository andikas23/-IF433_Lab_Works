package `teori week07`

object Koneksi {
    var linkServer: String = "http://localhost:8080";

    fun test_koneksi(){
        println("koneksi sukses dari $linkServer")
    }
}