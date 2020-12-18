package ramankav

import ramankav.AbstractLogger


class ConsoleLogger(level : Int) : AbstractLogger(){
    override fun write(message: String) {
        println("Standard Console::Logger: $message")
    }
    init {
        this.level = level
    }
}