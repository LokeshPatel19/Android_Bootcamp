package day01

fun main() {
    println("Enter the basic salary :")
    val basicSalary = readln().toDouble()

    println("Enter the hra given :")
    val hra = readln().toInt()

    println("Enter the bonus :")
    val bonus = readln().toDouble()

    val total = basicSalary + hra + bonus

    println("Total Salary : $total")

}