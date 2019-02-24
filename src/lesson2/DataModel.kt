package lesson2

fun main(args: Array<String>) {
    //[1,2,3]
    val a = arrayOf(1, 2, 3)
    //[0,2,4]
    val b = Array(3, { i -> (i * 2) })

    //读取数组内容
    println(a[0])    // 输出结果：1
    println(b[1])    // 输出结果：2
    a.get(0)
    b.set(0, 434)
    println(b[0])    // 输出结果：2

    val str = "nihaoa"
    for (c in str) {
        println(c)
    }

    val text = """
    多行字符串
    多行字符串
    """
    println(text)   // 输出有一些前置空格

    val text1 = """
    |多行字符串
    |菜鸟教程
    |多行字符串
    |Runoob
    """.trimMargin()
    println(text1)    // 前置空格删除了
}