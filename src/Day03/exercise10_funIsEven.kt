package Day03

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    println(isEven(5))
    println(isEven(58))
}