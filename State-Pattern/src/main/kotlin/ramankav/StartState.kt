package ramankav

class StartState : State {
    override fun doAction(context: Context) {
        println("Player is in start state")
        context.setState(this)
    }

    override fun toString(): String {
        return "Start State"
    }
}