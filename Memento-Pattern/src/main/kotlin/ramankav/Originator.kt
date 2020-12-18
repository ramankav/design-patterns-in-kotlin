package ramankav

class Originator (private var state: String) {

    fun setState(state: String) {
        this.state = state
    }

    fun getState(): String{
        return this.state
    }
    fun saveStateToMemento(): Memento {
        return Memento(this.state)
    }

    fun getStateFromMemento(memento: Memento) {
        this.state = memento.getState()
    }
}