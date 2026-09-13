package Day05

data class Student(
    val name: String,
    val marks: Int
)

fun main() {
    val students = listOf(
        Student("Lokesh", 85),
        Student("Rahul", 72),
        Student("Amit", 91),
        Student("Priya", 68),
        Student("Neha", 95)
    )

    val foundStudent = students.find {
        it.name == "Amit"
    }
    println(foundStudent)

    val studentsWithMarksGreaterThan80 = students.filter {
        it.marks >= 80
    }
    println(studentsWithMarksGreaterThan80)

    val studentNames = students.map {
        it.name
    }
    println(studentNames)

    val studentsSortedByMarks = students.sortedBy {
        it.marks
    }
    println(studentsSortedByMarks)

    val highestScore = students.maxOfOrNull {
        it.marks
    }
    println(highestScore)

    val passedStudentCount = students.count {
        it.marks >= 40
    }
    println(passedStudentCount)

    val everyonePassed = students.all {
        it.marks >= 40
    }
    println(everyonePassed)

    val joinedStudentNames = students.joinToString(" | ") {
        it.name
    }
    println(joinedStudentNames)
}