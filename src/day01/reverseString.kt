package day01

fun reverseString(input: String): String {

    val result = StringBuilder()

    for (index in input.length - 1 downTo 0) {

        result.append(input[index])
    }

    return result.toString()
}

fun main() {

    println(reverseString("KOTLIN"))
}