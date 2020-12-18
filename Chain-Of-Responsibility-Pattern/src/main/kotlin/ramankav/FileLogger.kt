package ramankav

import ramankav.AbstractLogger

class FileLogger(level : Int) : AbstractLogger() {

    override fun write(message: String) {
        println("File::Logger: $message")
    }

    init {
        this.level = level
    }
}