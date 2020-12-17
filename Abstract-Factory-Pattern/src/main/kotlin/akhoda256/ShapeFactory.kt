package akhoda256

class ShapeFactory : AbstractFactory() {
    override fun getShape(shapeType: String?): Shape? {
        if("SQUARE".equals(shapeType, ignoreCase = true)){
            return Square()
        } else if ("RECTANGLE".equals(shapeType, ignoreCase = true)){
            return Rectangle()
        }
        return null;
    }
}

