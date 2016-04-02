package classDeclaration

class KPerson(val name: String, val age: Int)

fun main(args: Array<String>) {
    // no new keyword
    val person = KPerson("Alice", 29)

    println(person)
}

open class University

//singleton
object FIT : University()

