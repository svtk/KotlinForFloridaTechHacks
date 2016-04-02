package extensions

fun String.lastChar() = this.get(this.length - 1)
//'this' can be omitted
fun String.lastChar1() = get(length - 1)

fun test() {
    //visible in completion
    "abc".lastChar()
}

// improving existing api; avoiding "dirty" interfaces

data class Person(val name: String, val age: Int)

fun Person.isAdult() = age > 21