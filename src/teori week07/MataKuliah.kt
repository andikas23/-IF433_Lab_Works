package `teori week07`

enum class MataKuliah(val jmlSks:Int) {
    OOP(jmlSks=3),
    GAMEDEV (jmlSks=4),
    DASPRO (jmlSks=2);

    fun sks_matkul(){
        println(" jml sksnya : $jmlSks")
    }

}