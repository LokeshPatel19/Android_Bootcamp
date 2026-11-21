package day01

fun main() {
    println("Enter your name :")
    val name = readln()

    println("Enter your age :")
    val age = readln().toInt()

    println("Enter your email :")
    val email = readln()

    println("Enter your mobile number :")
    val mobile = readln().toLong()

    println("is your id is still active :")
    val isActive = readln().toBoolean()

    print("Name : $name\nAge : $age\nEmail : $email\nMobile : $mobile\nActive : $isActive")

}