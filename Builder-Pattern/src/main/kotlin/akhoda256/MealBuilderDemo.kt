package akhoda256

fun main() {
    demo()
}

fun demo() {
    val mealBuilder = MealBuilder()

    val vegMeal = mealBuilder.prepareVegMeal()
    println("Veg Meal")
    vegMeal.showItems()
    println("Total Cost: " + vegMeal.cost)

    val nonVegMeal = mealBuilder.prepareNonVegMeal()
    println("\n\nNon-Veg Meal")
    nonVegMeal.showItems()
    println("Total Cost: " + nonVegMeal.cost)
}
