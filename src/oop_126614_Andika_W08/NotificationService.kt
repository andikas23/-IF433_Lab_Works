package oop_126614_Andika_W08

class NotificationService {

    fun sendEmail(emailAddress: String) {
        println("Sending email to $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("user ${user.name} tidak memiliki email")
        }
    }
}