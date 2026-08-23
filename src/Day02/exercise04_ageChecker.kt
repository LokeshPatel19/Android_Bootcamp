package Day02

fun main() {
    println("Enter the number :")
    val age = readln().toInt()

    if (age >= 18) {
        print("Adult")
    } else {
        print("Child")
    }
}