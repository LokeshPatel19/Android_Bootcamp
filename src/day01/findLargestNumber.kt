package day01

fun main() {

    println("Enter the list of numbers :")
    val numbers = intArrayOf(10,30, 20, 50, 45)

    var largest = numbers[0]

    for (i in numbers) {
        if (i > largest) {
            largest = i
        }
    }

    print("The largest number is : $largest")
}