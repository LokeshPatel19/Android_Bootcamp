package day02

import kotlin.math.pow

fun isArmstrong(number: Int): Boolean {
    if (number < 0) return false

    val digitsCount = number.toString().length
    var temp = number
    var sum = 0

    while (temp > 0) {
        val digit = temp % 10
        sum += digit.toDouble().pow(digitsCount).toInt()
        temp /= 10
    }

    return sum == number
}

fun main() {
    println("Enter the number :")
    val number = readln().toInt()
    print("Is $number an Armstrong number? ${isArmstrong(number)}")
}
