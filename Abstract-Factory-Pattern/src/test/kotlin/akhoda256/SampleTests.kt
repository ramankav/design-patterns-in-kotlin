package akhoda256


import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SampleTests {

    @Test
    fun testShapeConcreteClasses(){
        val shapeFactory = FactoryProducer.getFactory(false);

        val shape1 = shapeFactory.getShape("RECTANGLE");
        assertTrue(shape1 is Rectangle)

        val shape2 = shapeFactory.getShape("SQUARE");
        assertTrue(shape2 is Square)

        val shapeFactory1 = FactoryProducer.getFactory(true);

        val shape3 = shapeFactory1.getShape("RECTANGLE");
        assertTrue(shape3 is RoundedRectangle)

        val shape4 = shapeFactory1.getShape("SQUARE");
        assertTrue(shape4 is RoundedSquare)
    }

    @Test
    fun testShapeFactoryConcreteClasses(){
        val shapeFactory = FactoryProducer.getFactory(false);
        assertTrue(shapeFactory is ShapeFactory)

        val roundedShapeFactory = FactoryProducer.getFactory(true)
        assertTrue(roundedShapeFactory is RoundedShapeFactory)
    }
}