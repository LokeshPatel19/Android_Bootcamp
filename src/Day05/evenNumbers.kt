package Day05

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter { it ->
        it % 2 == 0
    }

    print(evenNumbers)
}