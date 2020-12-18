package ramankav

object StatePatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val context = Context()
        val startState = StartState()
        startState.doAction(context)
        println(context.getState().toString())
        val stopState = StopState()
        stopState.doAction(context)
        println(context.getState().toString())
    }
}