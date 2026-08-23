package Day02

fun main() {
    println("Enter the student name :")
    val studentName = readln()
    println("Enter the marks :")
    val marks = readln().toInt()
    println("Enter the attendance :")
    val attendance = readln().toDouble()

    println("Student: $studentName")

    when {
        marks >= 90 -> println("Result: Excellent")
        marks >= 75 -> println("Result: Very Good")
        marks >= 60 -> println("Result: Good")
        marks >= 40 -> println("Result: Pass")
        else -> println("Result: Fail")
    }

    if (attendance >= 75.0) {
        print("Eligibility: Eligible")
    } else {
        print("Eligibility: Not eligible")
    }
}