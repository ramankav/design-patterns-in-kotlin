class SingleObject  //make the constructor private so that this class cannot be instantiated
private constructor() {
    fun showMessage() {
        println("Hello World!")
    }

    companion object {
        //Get the only object available
        //create an object of SingleObject
        val instance = SingleObject()

    }
}
