fun main(){
    demo()
}

fun demo() {
    //illegal construct
    //Compile Time Error: The constructor SingleObject() is not visible
    //SingleObject object = new SingleObject();

    //Get the only object available
    val obj = SingleObject.instance

    //show the message
    obj.showMessage();
}
