package oop_126614_Andika_W07

object DatabaseManager {
    var connectionStatus: String ="Disconnected"

    fun connect (){
        connectionStatus = "Connected to server"
        println("database is ready")
    }

}