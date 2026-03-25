package oop_126614_Andika_W07

object GameManager{
    var isGameRunning: Boolean = false

    fun startGame(){
        if (isGameRunning){
            println("game sudah berjalan!")
        }else {
            isGameRunning = true
            println("Memulai Game Engine")
        }
    }
}