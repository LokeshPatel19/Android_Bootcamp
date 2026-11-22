package day02

fun validateLogin(inputUser: String, inputPass: String): String {
    val storedUsername = "admin"
    val storedPassword = "password123"

    return when {
        inputUser != storedUsername && inputPass != storedPassword -> "Invalid username and Invalid password"
        inputUser != storedUsername -> "Invalid username."
        inputPass != storedPassword -> "Invalid password."
        else -> "Login successful."
    }
}

fun main() {
    println("Enter username: ")
    val username = readln()

    println("Enter password: ")
    val password = readln()

    val result = validateLogin(username, password)
    print(result)
}
