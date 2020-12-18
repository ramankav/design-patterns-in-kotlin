package ramankav

import ramankav.CustomerFactory.getCustomer

object NullPatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        val customer1 = getCustomer("Rob")
        val customer2 = getCustomer("Bob")
        val customer3 = getCustomer("Julie")
        val customer4 = getCustomer("Laura")
        println("Customers")
        println(customer1.name)
        println(customer2.name)
        println(customer3.name)
        println(customer4.name)
    }
}