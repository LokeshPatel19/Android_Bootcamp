package Day05

//Answer using Kotlin collection functions:
//
//Are any numbers odd?
//Are all numbers even?
//Are none of the numbers negative?

fun main() {
    val numbers = listOf(2, 4, 6, 8, 10)

    val anyOdd = numbers.any { it % 2 != 0 }
    println(anyOdd)

    val allEven = numbers.all { it % 2 == 0 }
    println(allEven)

    val noneNegative = numbers.none { it < 0 }
    println(noneNegative)
}