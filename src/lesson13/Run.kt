package lesson13

fun getNullableLength(ns: String?) {
    println("for \"$ns\":")
    ns?.run {                                                  // 1
        println("\tis empty? " + isEmpty())                    // 2
        println("\tlength = $length")
        length                                                 // 3
    }
}


fun main(args: Array<String>) {
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}