package Day05

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)
    val doubleNumber = numbers.map { it ->
        it * 2
    }

    print(doubleNumber)
}