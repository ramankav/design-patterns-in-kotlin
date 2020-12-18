package ramankav

import ramankav.AbstractLogger

class ErrorLogger(level: Int) : AbstractLogger() {

    override fun write(message: String) {
        System.out.println("Error Console::Logger: $message");
    }

    init {
        this.level = level
    }
}