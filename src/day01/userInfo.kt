package day01

fun main() {
    val name = readln() ?: ""
    val age = readln().toInt() ?: 0
    val email = readln() ?: ""
    val mobile = readln()?.toLong() ?: 0L
    val isActive = readln()?.toBoolean() ?: false

    print("Hello my name is $name and I am $age years old. My email address is $email and my mobile number is $mobile. and employee id status is currently $isActive")
}