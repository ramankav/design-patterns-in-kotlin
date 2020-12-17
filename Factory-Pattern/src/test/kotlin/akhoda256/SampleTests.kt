package akhoda256

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class SampleTests {
    @Test
    fun testConcreteClasses() {
        var shapeFactory = ShapeFactory()
        assertTrue(shapeFactory.getShape("CIRCLE") is Circle)

        assertTrue(shapeFactory.getShape("RECTANGLE") is Rectangle )

        assertTrue(shapeFactory.getShape("SQUARE") is Square)
    }

    @Test
    fun testIgnoreCase() {
        var shapeFactory = ShapeFactory()
        assertTrue(shapeFactory.getShape("CirCLE") is Circle)

        assertTrue(shapeFactory.getShape("Rectangle") is Rectangle )

        assertTrue(shapeFactory.getShape("square") is Square)
    }

    @Test
    fun testIncorrectShapeTypeInput() {
        var shapeFactory = ShapeFactory()
        assertTrue( shapeFactory.getShape("HEMISPHERE") == null)
    }

    @Test
    fun testNullShapeTypeInput() {
        var shapeFactory = ShapeFactory()
        var nullStr: String? = null
        assertTrue(shapeFactory.getShape(nullStr) == null)
    }
}