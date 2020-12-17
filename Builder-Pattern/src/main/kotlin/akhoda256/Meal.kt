package akhoda256

import java.util.*


class Meal {
    var items: MutableList<Item> = ArrayList()

    fun addItem(item: Item){
        items.add(item)
    }

    val cost: Float
        get() {
            var cost = 0.0f
            for (item in items) {
                cost += item.price()
            }
            return cost
        }
    fun showItems() {
        for (item in items) {
            print("Item : " + item.name())
            print(", Packing : " + item.packing()!!.pack())
            println(", Price : " + item.price())
        }
    }
}