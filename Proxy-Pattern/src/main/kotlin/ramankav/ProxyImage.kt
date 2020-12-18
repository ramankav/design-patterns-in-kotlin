package ramankav

class ProxyImage(private val fileName : String) : Image{
    private var realImage: RealImage? = null

    override fun display() {
        if(realImage == null){
            this.realImage = RealImage(fileName)
        }
        realImage!!.display()
    }
}