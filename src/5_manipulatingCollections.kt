package manipulatingCollections

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    // different forms of lambda expression
    people.maxBy({ p: Person -> p.age })
    people.maxBy { p: Person -> p.age }
    people.maxBy { p -> p.age }
    people.maxBy { it.age }

    // member reference
    people.maxBy(Person::age)

    println(people.maxBy(Person::age))
    println(people.filter { it.age > 30 }.map(Person::name))
}
