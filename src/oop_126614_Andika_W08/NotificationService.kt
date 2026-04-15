package oop_126614_Andika_W08

class NotificationService {
    fun sendEmail(EmailAddress:String){
        println("Sending email to ${EmailAddress}")
    }
}

fun processUser(user:UserProfile){

    if (user.email !=null){
        sendEmail(emailAddress = user.email)
    } else {
        println("user ${user.name} tidak memiliki email")
    }
}