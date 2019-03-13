package lesson11

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun sum(x: Int, y: Int) = x + y                                     // 3

fun operation(): (Int) -> Int {                                     // 1
    return ::square
}

fun square(x: Int) = x * x

data class Item(val name: String, val price: Float)                                   // 1

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F    // 2
fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"

val Order.commaDelimitedItemNames: String                                             // 3
    get() = items.map { it.name }.joinToString()

fun main(args: Array<String>) {
    val sumResult = calculate(4, 5, ::sum)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")

    val func = operation()                                          // 3
    println(func(2))

    val upperCase1: (String) -> String = { str: String -> str.toUpperCase() } // 1

    val upperCase2: (String) -> String = { str -> str.toUpperCase() }         // 2

    val upperCase3 = { str: String -> str.toUpperCase() }                     // 3

// val upperCase4 = { str -> str.toUpperCase() }                          // 4

    val upperCase5: (String) -> String = { it.toUpperCase() }                 // 5

    val upperCase6: (String) -> String = String::toUpperCase                  // 6

    println(upperCase2("hello"))
    println(upperCase1("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")                     // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")
}