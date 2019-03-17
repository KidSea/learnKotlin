package lesson13


class Person1() {
    var host: String = "2121212"
    var port: String = "1212"
}

fun main(args: Array<String>) {
    val jake = Person1()                                     // 1
    val stringDescription = jake.apply {                    // 2
        host = "Jake"                                       // 3
        port = "dasdada"
    }.toString()

    println(stringDescription)
}