package day02

import kotlin.math.abs

fun countDigitOccurrences(number: Int, targetDigit: Int): Int {
    if (number == 0 && targetDigit == 0) return 1

    var temp = abs(number)
    var count = 0

    while (temp > 0) {
        if (temp % 10 == targetDigit) {
            count++
        }
        temp /= 10
    }

    return count
}

fun main() {
    val number = 747279
    val digit = 7
    println("Digit $digit appears ${countDigitOccurrences(number, digit)} times in $number.")
}
