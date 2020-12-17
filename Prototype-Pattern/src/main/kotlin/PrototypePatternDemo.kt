

fun main(){
    demo()
}

fun demo() {
    ShapeCache.loadCache()

    println("Shape : " + ShapeCache.getShape("1").type)

    println("Shape : " + ShapeCache.getShape("2").type)

    println("Shape : " + ShapeCache.getShape("3").type)
}
