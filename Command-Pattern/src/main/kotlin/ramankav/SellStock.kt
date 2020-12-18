package ramankav


class SellStock (private val abcStock: Stock) : Order {
    override fun execute() {
        abcStock.sell()
    }
}
