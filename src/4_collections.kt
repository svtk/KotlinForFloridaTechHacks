package collections

fun main(args: Array<String>) {

    // read-only

    val list = listOf(1, 2, 3)
    val set = setOf(1, 2, 3)
    val map = mapOf(1 to "one", 2 to "two")

    // mutable

    val arrayList = mutableListOf(1, 2, 3)
    val mutableSet = mutableSetOf(1, 2, 3)
    val mutableMap = mutableMapOf(1 to "one", 2 to "two")

    // iterating

    for (e in list) {
        println(e)
    }
    for ((key, value) in map) {
        println("$key : $value")
    }

    // in check
    val key = 2
    if (key in map) {

        // access an element in a map
        println(map[key])
    }
}