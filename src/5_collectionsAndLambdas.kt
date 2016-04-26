package collections

fun create() {
    val list = listOf(1, 2, 3)
    val set = setOf(1, 2, 3)
    val map = mapOf(1 to "one", 2 to "two")

    // mutable

    val arrayList = mutableListOf(1, 2, 3)
    val mutableSet = mutableSetOf(1, 2, 3)
    val mutableMap = mutableMapOf(1 to "one", 2 to "two")
}

fun q0(map: Map<Int, String>) {
    for (entry in map) {
        val key = entry.key
        val value = entry.value
    }

    map.get(42)
}

fun q1(list: List<String>) {
    var index = 0
    for (s in list) {
        println("" + index + ". " + s)
        index++
    }
}

fun a1(list: List<String>) {
    for ((index, s) in list.withIndex()) {
        println("$index. $s")
    }
}