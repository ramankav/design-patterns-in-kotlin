package ramankav

import ramankav.ChatRoom.showMessage

class User(private var name: String) {

    fun getName(): String{
        return name
    }

    fun setName(name : String){
        this.name = name
    }

    fun sendMessage(message: String?) {
        showMessage(this, message!!)
    }

}