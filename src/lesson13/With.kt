package lesson13

class Person() {
    val host: String = "2121212"
    val port: String = "1212"
}

fun main(args: Array<String>) {
    val configuration = Person()
    with(configuration) {
        println("$host:$port")
    }

    println("${configuration.host}:${configuration.port}")
}