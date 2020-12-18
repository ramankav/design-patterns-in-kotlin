package akhoda256

class ShapeMaker {
    private val circle : Shape
    private val rectangle : Shape
    private val square : Shape

    fun drawCircle(){
        circle.draw()
    }

    fun drawRectangle(){
        rectangle.draw()
    }

    fun drawSquare(){
        square.draw()
    }

    init {
        circle = Circle()
        rectangle = Rectangle()
        square = Square()
    }
}
