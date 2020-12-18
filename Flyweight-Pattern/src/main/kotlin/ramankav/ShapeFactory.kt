package ramankav

import java.util.*


object ShapeFactory {
    private val circleMap : HashMap<String, Circle> = HashMap()

    fun getCircle(color: String) : Shape{
        var circle = circleMap[color]
        if (circle == null) {
            circle = Circle(color)
            circleMap[color] = circle
            println("Creating circle of color : $color")
        }
        return circle
    }
}