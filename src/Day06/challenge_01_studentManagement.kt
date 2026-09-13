package Day06

// We use a standard class so we can easily add custom validation and methods
class Student(val name: String, val marks: Int) {

    // Validate that marks are between 0 and 100 during object creation
    init {
        require(marks in 0..100) { "Marks must be between 0 and 100. Provided: $marks" }
    }

    // Function inside the class to display student details
    fun displayDetails() {
        println("Student: $name, Marks: $marks")
    }
}

fun main() {
    // Create a list of students
    val students = listOf(
        Student("Lokesh", 85),
        Student("Rahul", 45),
        Student("Amit", 92),
        Student("Priya", 78),
        Student("Sneha", 35)
    )

    // 1. Print all student names
    println("--- All Student Names ---")
    students.forEach { println(it.name) }

    // 2. Find the student named "Amit"
    println("\n--- Finding Amit ---")
    val amit = students.find { it.name == "Amit" }
    amit?.displayDetails() ?: println("Amit not found")

    // 3. Print students who scored at least 80
    println("\n--- Students with 80+ Marks ---")
    val topStudents = students.filter { it.marks >= 80 }
    topStudents.forEach { it.displayDetails() }

    // 4. Calculate the highest marks
    println("\n--- Highest Marks ---")
    val highestMarks = students.maxOf { it.marks }
    println("Highest Marks: $highestMarks")

    // 5. Calculate the average marks
    println("\n--- Average Marks ---")
    val averageMarks = students.map { it.marks }.average()
    println("Average Marks: $averageMarks")

    // 6. Count how many students passed (assuming passing mark is 40)
    println("\n--- Passed Students Count ---")
    val passCount = students.count { it.marks >= 40 }
    println("Number of students who passed: $passCount")

    // 7. Check whether every student passed
    println("\n--- Did Everyone Pass? ---")
    val didEveryonePass = students.all { it.marks >= 40 }
    println("Everyone passed: $didEveryonePass")

    // 8. Sort students by marks (Descending order)
    println("\n--- Sorted by Marks (Highest First) ---")
    val sortedStudents = students.sortedByDescending { it.marks }
    sortedStudents.forEach { it.displayDetails() }

    // 9. Testing validation (Uncommenting this line will crash the program with an error)
    // val invalidStudent = Student("Invalid", 105)
}
