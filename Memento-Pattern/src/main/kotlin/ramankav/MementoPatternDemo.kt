package ramankav

object MementoPatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val originator = Originator("State #1")
        val careTaker = CareTaker()
        originator.setState("State #2")
        careTaker.add(originator.saveStateToMemento())
        originator.setState("State #3")
        careTaker.add(originator.saveStateToMemento())
        originator.setState("State #4")
        println("Current State: " + originator.getState())
        originator.getStateFromMemento(careTaker[0])
        println("First saved State: " + originator.getState())
        originator.getStateFromMemento(careTaker[1])
        println("Second saved State: " + originator.getState())
    }
}