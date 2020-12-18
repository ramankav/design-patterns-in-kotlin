class BinaryObserver(subject: Subject?) : Observer() {
    override fun update() {
        println("Binary String: " + Integer.toBinaryString(subject!!.getState()))
    }

    init {
        this.subject = subject
        this.subject!!.attach(this)
    }
}