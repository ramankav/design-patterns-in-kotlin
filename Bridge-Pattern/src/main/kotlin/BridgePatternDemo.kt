fun main(){
    demo()
}

fun demo() {
    val redCircle: Shape = Circle(100, 100, 10, RedCircle())
    val greenCircle: Shape = Circle(100, 100, 10, GreenCircle())

    redCircle.draw()
    greenCircle.draw()
}
