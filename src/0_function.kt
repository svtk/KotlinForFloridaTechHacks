package main

fun main(args: Array<String>) {
    println("Hello")

    // read-only
    val question = "life the universe and everything"
    println("$question?")

    // mutable
    var answer: Int = 0
    answer = 42
}

fun max(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun max2(a: Int, b: Int) = if (a < b) a else b

fun sum(a: Int, b: Int, c: Int = 0) = a + b + c
fun use() {
    sum(1, 2)
    sum(1, 2, 3)
    sum(b = 2, a = 1)
}

