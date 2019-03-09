package lesson7

fun tryCatch() {
    try {
        val a : Int? = null
        print(a)
    } catch (e : Exception) {

    } finally {

    }
}

fun main(args: Array<String>) {
    tryCatch()
    throw Throwable("asdasd")
}