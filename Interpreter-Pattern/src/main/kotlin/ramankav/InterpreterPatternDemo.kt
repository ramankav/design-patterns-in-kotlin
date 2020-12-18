package ramankav

object InterpreterPatternDemo {
    //Rule: Robert and John are male
    private fun getMaleExpression(): Expression {
            val robert: Expression = TerminalExpression("Robert")
            val john: Expression = TerminalExpression("John")
            return OrExpression(robert, john)
    }

    //Rule: Julie is a married women
    private fun getMarriedWomanExpression (): Expression {
            val julie: Expression = TerminalExpression("Julie")
            val married: Expression = TerminalExpression("Married")
            return AndExpression(julie, married)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val isMale = getMaleExpression()
        val isMarriedWoman = getMarriedWomanExpression()
        println("John is male? " + isMale.interpret("John"))
        println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"))
    }
}