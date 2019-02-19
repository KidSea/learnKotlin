package lesson1

fun test(){}
class Student{}

//函数返回
fun sum(a: Int, b: Int): Int {
    return a + b
}
//表达式
fun sum(a: Int, b: Int, c: Int) = a + b + c
//无返回值
fun sum(a: Int, b: Int, c: Int, d: Int): Unit {

}
//匹配多参数
fun vars(vararg a: Int) {
    for(vt in a){
        print(vt)
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // 做过类型判断以后，obj会被系统自动转换为String类型
        return obj.length
    }

    //在这里还有一种方法，与Java中instanceof不同，使用!is
    // if (obj !is String){
    //   // XXX
    // }

    // 这里的obj仍然是Any类型的引用
    return null
}

fun main(args: Array<String>) {
    Greeter("xuehai").greet()
    println("sum return: " + sum(1, 2))
    println("sum return: " + sum(1, 2, 5))
    vars(1, 2, 3, 4)
    println()
    var a = 1
    // 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
    // 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

    //类型后面加?表示可为空
    val age: String? = "21"
    //抛出空指针异常
    val ages = age!!.toInt()
    println(ages)
    //不做处理返回 null
    val ages1 = age?.toInt()
    println(ages1)
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1
    println(ages2)

    for (i in 1..4) print(i) // 输出“1234”

    for (i in 4..1) print(i) // 什么都不输出
    val i = 4
    if (i in 1..10) { // 等同于 1 <= i && i <= 10
        println(i)
    }
}

class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

