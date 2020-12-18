object ObserverPatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val subject = Subject()
        HexaObserver(subject)
        OctalObserver(subject)
        BinaryObserver(subject)
        println("First state change: 15")
        subject.setState(15)
        println("Second state change: 10")
        subject.setState(10)
    }
}