package akhoda256

fun demo() {
    val shapeFactory = ShapeFactory()

    val shape1 = shapeFactory.getShape("CIRCLE")
    shape1!!.draw()

    val shape2 = shapeFactory.getShape("RECTANGLE")
    shape2?.draw()

    val shape3 = shapeFactory.getShape("SQUARE")
    shape3?.draw()
}

fun main() {
    demo()
}