package Day02

fun main() {
    println("Enter the number :")
    val number = readln().toInt()

    if (number % 2 == 0) {
        print("Number is even")
    } else {
        print("Number is odd")
    }
}