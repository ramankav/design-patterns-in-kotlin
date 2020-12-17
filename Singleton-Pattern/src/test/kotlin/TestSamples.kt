import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TestSamples {
    @Test
    fun testSingletonCorrectUsage(){
        val singleObj1 = SingleObject.instance
        val singleObj2 = SingleObject.instance
        assertTrue(singleObj1 == singleObj2)
    }

}