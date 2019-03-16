package lesson12

fun main(args: Array<String>) {
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val anyNegative = numbers.any { it < 0 }             // 2

    val anyGT6 = numbers.any { it > 6 }

    val allEven = numbers.all { it % 2 == 0 }            // 2

    val allLess6 = numbers.all { it < 6 }

    val allEven1 = numbers.none { it % 2 == 1 }           // 2

    val allLess61 = numbers.none { it > 6 }

    println("" + anyNegative + " " + anyGT6 + " " + allEven + " " + allLess6)

    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    val first = words.find { it.startsWith("some") }                                // 2
    val last = words.findLast { it.startsWith("some") }                             // 3

    val nothing = words.find { it.contains("nothing") }

    println("" + first + " " + last + " " + nothing + " " + allLess6)
}