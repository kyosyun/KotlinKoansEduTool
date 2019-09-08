fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    val email= client?.personalInfo?.email ?: return
    val message = message ?: return
    mailer.sendMessage(email, message)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
