package oop_126614_Andika_W07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id" //shared constant

        fun createClient(): NetworkClient {
            println("membangun networkclient dengan BASE_URL: $BASE_URL")
            return NetworkClient("$BASE_URL")
        }
    }
    fun connect(){
        println("Connecting to $url")
    }
}