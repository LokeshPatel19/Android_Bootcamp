package day02

import kotlin.math.sqrt

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun printPrimesUpTo(n: Int) {
    print("Prime numbers between 1 and $n: ")
    for (i in 2..n) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
    println()
}

fun main() {
    val n = 30
    printPrimesUpTo(n)
}
