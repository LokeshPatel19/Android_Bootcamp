package Day04

fun printUserProfile(name: String?, age: Int?, city: String?) {
    // Use the Elvis operator to provide fallback default values
    val displayName = name ?: "Guest"
    val displayAge = age ?: "Unknown"
    val displayCity = city ?: "Unknown"

    println("Name: $displayName")
    println("Age: $displayAge")
    println("City: $displayCity")
}

fun main() {
    // Test Case 1: All values provided
    println("--- Test Case 1 ---")
    printUserProfile("Lokesh", 25, "Pune")

    // Test Case 2: All values null
    println("\n--- Test Case 2 ---")
    printUserProfile(null, null, null)
}
