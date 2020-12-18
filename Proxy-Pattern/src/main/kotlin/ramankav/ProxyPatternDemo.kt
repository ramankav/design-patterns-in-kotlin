package ramankav

fun main(){
    demo()
}

fun demo() {
    val image = ProxyImage("test-10mb.jpg")
    image.display()
    println("")
    image.display()
}
