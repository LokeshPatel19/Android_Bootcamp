package Day03

fun main() {

    println("Enter the number :")
    val number = readln().toInt()

    var sum = 0

    for (i in 1..number) {
        sum += i
    }
    print("Sum of numbers : $sum")
}