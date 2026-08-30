package Day04

fun getLoginStatus(isLoggedIn: Boolean?): String {
    return when (isLoggedIn) {
        true -> "Home Screen"
        false -> "Login Screen"
        null -> "Checking login status..."
    }
}

fun main() {
    println(getLoginStatus(true))
    println(getLoginStatus(false))
    println(getLoginStatus(null))
}