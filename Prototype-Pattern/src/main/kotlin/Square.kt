class Square : Shape() {
    override fun draw() {
        println("Inside Square::draw() method.")
    }

    init {
        type = "Square"
    }
}