import java.util.*

class Subject {
    private val observers: MutableList<Observer> = ArrayList()
    private var state = 0

    fun getState() : Int{
        return state
    }
    fun setState(state: Int) {
            this.state = state
            notifyAllObservers()
    }

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun notifyAllObservers() {
        for (observer in observers) {
            observer.update()
        }
    }
}