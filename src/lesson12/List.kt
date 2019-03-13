package lesson12

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // 1
val sudoers: List<Int> = systemUsers                              // 2

fun addSudoer(newUser: Int) {                                     // 3
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                                  // 4
    return sudoers
}


fun main(args: Array<String>) {
    addSudoer(4)                                                  // 5
    println("Tot sudoers: ${getSysSudoers().size}")               // 6
    getSysSudoers().forEach{                                      // 7
            i -> println("Some useful info on user $i")
    }
}