package oop_126614_Andika_W07

fun main(){
    println("=== TEST SINGLETON ===")
    println("status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("/n=== TEST COMPANION OBJECT ===")
    val client= NetworkClient.createClient()
    client.connect()
}
