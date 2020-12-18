class OctalObserver(subject: Subject?) : Observer() {
    override fun update() {
        println("Octal String: " + Integer.toOctalString(subject!!.getState()))
    }

    init {
        this.subject = subject
        this.subject!!.attach(this)
    }
}