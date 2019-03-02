package lesson6

object Resource {
    val name = "Tom"
}

fun main(args: Array<String>) {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])
    // ?.  if not null
    // ?. ?: if not null and else
    // ?: if null then
    val emails = "123" // 可能会是空集合
    val mainEmail = emails.firstOrNull() ?: ""

    val data = ""
    data?.let {
        print("sadasd")
    }

}