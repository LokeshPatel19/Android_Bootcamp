package Day02

fun main() {
    println("Enter the first number:")
    val firstNumber = readln().toInt()

    println("Enter the second number:")
    val secondNumber = readln().toInt()

    println("Addition: ${firstNumber + secondNumber}")
    println("Subtraction: ${firstNumber - secondNumber}")
    println("Multiplication: ${firstNumber * secondNumber}")

    if (secondNumber != 0) {
        println("Division: ${firstNumber / secondNumber}")
        println("Remainder: ${firstNumber % secondNumber}")
    } else {
        println("Division and remainder are not possible because the second number is 0.")
    }
}