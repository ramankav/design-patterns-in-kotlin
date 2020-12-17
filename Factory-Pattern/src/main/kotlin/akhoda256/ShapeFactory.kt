package akhoda256

class ShapeFactory {
    fun getShape(shapeType: String?): Shape? {
        if(shapeType == null) {
            return null;
        }
        if ("CIRCLE".equals(shapeType, ignoreCase = true)){
            return Circle();
        } else if ("RECTANGLE".equals(shapeType, ignoreCase = true)){
            return Rectangle();
        }
        else if ("SQUARE".equals(shapeType, ignoreCase = true)){
            return Square();
        }
        return null;
    }
}