class HexaObserver(subject: Subject?) : Observer() {
    override fun update() {
        println("Hex String: " + Integer.toHexString(subject!!.getState()).toUpperCase())
    }

    init {
        this.subject = subject
        this.subject!!.attach(this)
    }
}