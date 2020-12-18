package ramankav

interface Expression {
    fun interpret(context: String): Boolean
}