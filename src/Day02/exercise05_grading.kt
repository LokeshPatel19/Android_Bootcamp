package Day02

fun main() {
    println("Enter the marks:")
    val marks = readln().toInt()

    when {
        marks >= 90 -> print("A")
        marks >= 75 -> print("B")
        marks >= 60 -> print("C")
        marks >= 40 -> print("D")
        else -> print("Fail")
    }
}