fun main(){
    demo()
}

fun demo() {
    val circle: Shape = Circle()

    val redCircle: Shape = RedShapeDecorator(Circle())

    val redRectangle: Shape = RedShapeDecorator(Rectangle())
    println("Circle with normal border")
    circle.draw()

    println("\nCircle of red border")
    redCircle.draw()

    println("\nRectangle of red border")
    redRectangle.draw()
}
