package oop_126614_Andika_W12

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    runCatching{
        "100".toInt()
    }.onSuccess {v->
        println("berhasil dikonversi :$v")
    }.onFailure {e ->
        println("gagal konversi :${e.message}")
    }
}

