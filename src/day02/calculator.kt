package day02

fun calculate(num1: Double, num2: Double, operator: String): String {
    return when (operator) {
        "+" -> "Result: ${num1 + num2}"
        "-" -> "Result: ${num1 - num2}"
        "*" -> "Result: ${num1 * num2}"
        "/" -> if (num2 != 0.0) "Result: ${num1 / num2}" else "Error: Cannot divide by zero."
        else -> "Error: Invalid operator '$operator'."
    }
}

fun main() {
    println("Enter first number: ")
    val firstNumber = readln().toDoubleOrNull()

    println("Enter second number: ")
    val secondNumber = readln().toDoubleOrNull()

    if (firstNumber == null || secondNumber == null) {
        println("Error: Please enter valid numbers.")
        return
    }

    println("\n--- Menu ---")
    println(" + : Addition")
    println(" - : Subtraction")
    println(" * : Multiplication")
    println(" / : Division")
    print("Choose an operator: ")
    val operator = readln().trim()

    print(calculate(firstNumber, secondNumber, operator))
}
