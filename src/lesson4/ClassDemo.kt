package lesson4

open class Person(name: String, age: Int, gentle: String) {
    var name = name
    var age = age
    var gentle = gentle

    var lastName: String = "zhang"
        get() = field.toUpperCase()   // 将变量赋值后转换为大写
        set

    var no: Int = 100
        get() = field                // 后端变量
        set(value) {
            if (value < 10) {       // 如果传入的值小于 10 返回该值
                field = value
            } else {
                field = -1         // 如果传入的值大于等于 10 返回 -1
            }
        }

    var heiht: Float = 145.4f
        private set
}

class Student(name: String, age: Int, gentle: String) : Person(name, age, gentle) {

}

class Runoob  constructor(name: String) {  // 类名为 Runoob
    // 大括号内是类体构成
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var siteName = name

    init {
        println("初始化网站名: ${name}")
    }
    // 次构造函数
    constructor (name: String, alexa: Int) : this(name) {
        println("Alexa 排名 $alexa")
    }

    fun printTest() {
        println("我是类的函数")
    }
}

class Outer {                  // 外部类
    private val bar: Int = 1
    class Nested {             // 嵌套类
        fun foo() = 2
    }
}

class Outer1 {
    private val bar: Int = 1
    var v = "成员属性"
    /**嵌套内部类**/
    inner class Inner {
        fun foo() = bar  // 访问外部类成员
        fun innerTest() {
            var o = this@Outer1 //获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }
}

fun main(args: Array<String>) {
    var student = Student("yuxuehai", 12, "男")
    println(student.name + "," + student.age + "," + student.gentle)
    student.lastName = "wang"

    println("lastName:${student.lastName}")

    student.no = 9
    println("no:${student.no}")

    student.no = 20
    println("no:${student.no}")

    val runoob =  Runoob("菜鸟教程", 10000)
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()

    val demo = Outer.Nested().foo() // 调用格式：外部类.嵌套类.嵌套类方法/属性
    println(demo)    // == 2

    val demo2 = Outer1().Inner().foo()
    println(demo2) //   1
    val demo3 = Outer1().Inner().innerTest()
    println(demo3)   // 内部类可以引用外部类的成员，例如：成员属性
}