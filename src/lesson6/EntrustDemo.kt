package lesson6

interface Base {
    fun print()
    fun printMessage()
    fun printMessageLine()
}
class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
    override fun printMessage() { print(x) }
    override fun printMessageLine() { println(x)}
}
class Derived(a: Base) : Base by a {
    override fun printMessage() { print("abc") }
}
fun main() {
    val b = BaseImpl(10)
    Derived(b).print()
    Derived(b).printMessage()
    Derived(b).printMessageLine()
}