package ramankav

abstract class AbstractLogger {

    protected var level : Int = 0
    private var nextLogger: AbstractLogger? = null

    fun logMessage(level : Int, message: String){
        if(this.level <= level){
            write(message)
        }
        if(nextLogger != null) {
            nextLogger?.logMessage(level, message)
        }
    }
    protected abstract fun write(message: String)

    fun setNextLogger(nextLogger: AbstractLogger?) {
        this.nextLogger = nextLogger
    }

    companion object {
        var INFO = 1
        var DEBUG = 2
        var ERROR = 3
    }
}
