package ramankav

import ramankav.ShapeFactory.getCircle

fun main(){
    demo()
}
val colors = arrayOf("Red", "Green", "Blue", "White", "Black")
fun demo() {

    for (i in 0..19) {
        val circle = ShapeFactory.getCircle(getRandomColor()) as Circle
        circle.setX(getRandomX())
        circle.setY(getRandomY())
        circle.setRadius(100)
        circle.draw()
    }
}

fun getRandomColor(): String {
    return colors[(Math.random() * colors.size).toInt()]
}

fun getRandomX(): Int {
    return (Math.random()*100).toInt()
}

fun getRandomY(): Int {
    return (Math.random() * 100).toInt()
}
