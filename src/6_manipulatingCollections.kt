package manipulatingCollections2

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    val canBeInClub27 = { p: Person -> p.age <= 27 }

    people.all(canBeInClub27)
    people.any(canBeInClub27)
    people.count(canBeInClub27)
}
