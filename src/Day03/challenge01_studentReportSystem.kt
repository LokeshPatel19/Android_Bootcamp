package Day03

// Determines the grade based on marks
fun getGrade2(marks: Int): String {
    if (marks !in 0..100) {
        return "Invalid Grade"
    }

    return when {
        marks >= 90 -> "A"
        marks >= 75 -> "B"
        marks >= 60 -> "C"
        marks >= 40 -> "D"
        else -> "Fail"
    }
}

// Checks if the student meets the 75% attendance criteria
fun isEligible(attendance: Double): Boolean {
    return attendance in 75.0..100.0
}


// Prints the formatted student performance report
fun printReport(name: String, grade: String, eligible: Boolean) {
    val eligibilityStatus = if (eligible) "Eligible" else "Not Eligible (Low Attendance)"

    println("\n--- Student Performance Report ---")
    println("Name: $name")
    println("Grade: $grade")
    println("Exam Eligibility: $eligibilityStatus")
    println("----------------------------------")
}

fun main() {
    println("Enter the name :")
    val name = readln()

    println("Enter the Marks :")
    val marks = readln().toInt()
    val grade = getGrade2(marks)

    println("Enter the Attendance :")
    val attendance = readln().toDouble()
    val eligible = isEligible(attendance)

    printReport(name = name, grade = grade, eligible = eligible)
}