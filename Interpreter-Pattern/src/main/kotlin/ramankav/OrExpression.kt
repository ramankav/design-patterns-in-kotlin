package ramankav


class OrExpression(private val expr1: Expression, private val expr2: Expression) : Expression {
    override fun interpret(context: String): Boolean {
        return expr1.interpret(context) || expr2.interpret(context)
    }
}