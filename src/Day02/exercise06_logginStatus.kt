package Day02

fun main() {
    val isLoggedIn = readln().toBoolean()

    if (isLoggedIn) {
        print("Home Screen")
    } else {
        print("Login Screen")
    }
}