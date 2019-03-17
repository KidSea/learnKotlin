package lesson13

fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {                         // 4
        print("\t")
//        customPrint(it)
        println()
    }
}


fun main(args: Array<String>) {
    val empty = "test".let {               // 1
//        customPrint(it)                    // 2
        it.isEmpty()                       // 3
    }
    println(" is empty: $empty")
    printNonNull(null)
    printNonNull("my string")
}