package ramankav

object CommandPatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val abcStock = Stock()
        val buyStockOrder = BuyStock(abcStock)
        val sellStockOrder = SellStock(abcStock)
        val broker = Broker()
        broker.takeOrder(buyStockOrder)
        broker.takeOrder(sellStockOrder)
        broker.placeOrders()
    }
}