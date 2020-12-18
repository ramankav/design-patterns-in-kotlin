package ramankav

class StopState : State {
    override fun doAction(context: Context) {
        println("Player is in stop state")
        context.setState(this)
    }

    override fun toString(): String {
        return "Stop State"
    }
}