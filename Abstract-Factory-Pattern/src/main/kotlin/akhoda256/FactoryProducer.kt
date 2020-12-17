package akhoda256

object FactoryProducer {
    fun getFactory(rounded: Boolean): AbstractFactory{
        return if (rounded){
             RoundedShapeFactory()
        }
        else {
             ShapeFactory()
        }
    }
}