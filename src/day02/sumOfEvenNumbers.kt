package day02

fun sumOfEvens(n: Int): Int {
    var sum = 0
    for (i in 2..n step 2) {
        sum += i
    }
    return sum
}

fun main() {
    println("Enter the number :")
    val n = 10
    print("Sum of even numbers from 1 to $n is ${sumOfEvens(n)}")
}
