package lesson4

open class Human(var name : String, var age : Int){// 基类
    open fun study(){       // 允许子类重写
        println("我毕业了")
    }
}

class Child(name : String, age : Int, var no : String, var score : Int) : Human(name, age) {
    override fun study(){    // 重写方法
        println("我在读大学")
    }
}

interface MyInterface {
    var name:String //name 属性, 抽象的
    fun bar()
    fun foo() {
        // 可选的方法体
        println("foo")
    }
}
class Child1 : MyInterface {
    override var name: String = "runoob" //重写属性
    override fun bar() {
        // 方法体
        println("bar")
    }
}

interface A {
    fun foo() { print("A") }   // 已实现
    fun bar()                  // 未实现，没有方法体，是抽象的
}

interface B {
    fun foo() { print("B") }   // 已实现
    fun bar() { print("bar") } // 已实现
}

class C : A {
    override fun bar() { print("bar") }   // 重写
}

class User(var name:String)

/**扩展函数**/
fun User.Print(){
    print("用户名 $name")
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main(args: Array<String>) {
    val s =  Child("Runoob", 18, "S12346", 89)
    println("学生名： ${s.name}")
    println("年龄： ${s.age}")
    println("学生号： ${s.no}")
    println("成绩： ${s.score}")
    s.study()

    val c =  Child1()
    c.foo();
    c.bar();
    println(c.name)

    val d =  D()
    d.foo();
    d.bar();

    var user = User("Runoob")
    user.Print()
}