package akhoda256

abstract class AbstractFactory {
    abstract fun getShape (shapeType : String?): Shape?
}

