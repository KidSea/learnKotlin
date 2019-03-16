package lesson12

data class Person(val name: String, val city: String, val phone: String) // 1

fun main(args: Array<String>) {
    val people = listOf(                                                     // 2
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

    val phoneBook = people.associateBy { it.phone }                          // 3
    val cityBook = people.associateBy(Person::phone, Person::city)           // 4
    val peopleCities = people.groupBy(Person::city, Person::name)            // 5

    println(phoneBook)
    println(cityBook)
    println(peopleCities)

    val numbers = listOf(1, -2, 3, -4, 5, -6)                // 1

    val evenOdd = numbers.partition { it % 2 == 0 }           // 2
    val (positives, negatives) = numbers.partition { it > 0 } // 3

    println("" + evenOdd + " | " + positives + " | " + negatives)

    val numbers1 = listOf(1, 2, 3)                        // 1

    val tripled = numbers1.flatMap { listOf(it, it, it) } // 2

    println(tripled)
}