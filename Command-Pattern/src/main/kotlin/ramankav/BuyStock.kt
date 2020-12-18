package ramankav

class BuyStock(val abcStock: Stock) : Order{

    override fun execute() {
        abcStock.buy()
    }
}