package ramankav

import ramankav.AbstractLogger
import kotlin.math.log

fun main(){
    demo()
}

fun demo() {
    val loggerChain = getChainOfLoggers()

    loggerChain.logMessage(AbstractLogger.INFO, "This is an information.")
    loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug level information.")
    loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.")
}

fun getChainOfLoggers() : AbstractLogger {
    val errorLogger = ErrorLogger(AbstractLogger.ERROR)
    val fileLogger = FileLogger(AbstractLogger.DEBUG)
    val consoleLogger = ConsoleLogger(AbstractLogger.INFO)

    errorLogger.setNextLogger(fileLogger)
    fileLogger.setNextLogger(consoleLogger)

    return errorLogger
}
