package akhoda256

class RoundedShapeFactory: AbstractFactory() {
    override fun getShape(shapeType: String?): Shape? {
        if("SQUARE".equals(shapeType, ignoreCase = true)){
            return RoundedSquare()
        } else if ("RECTANGLE".equals(shapeType, ignoreCase = true)){
            return RoundedRectangle()
        }
        return null;
    }
}