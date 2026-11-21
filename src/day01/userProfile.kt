package day01

fun main() {
    // Fixed profile details (immutable)
    val username = "alex_dev"
    val age = 26
    val height = 175.5 // in cm
    val isPremiumUser = true

    // Mutable variable for tasks that can change
    var completedTasks = 12

    // Print initial formatted profile
    println("=== USER PROFILE ===")
    println("Username        : $username")
    println("Age             : $age years")
    println("Height          : $height cm")
    println("Premium Member  : ${if (isPremiumUser) "Yes" else "No"}")
    println("Completed Tasks : $completedTasks")
    println("====================\n")

    // Update the var variable
    completedTasks += 3 // Now 15

    // Print updated profile
    println("=== UPDATED USER PROFILE ===")
    println("Username        : $username")
    println("Age             : $age years")
    println("Height          : $height cm")
    println("Premium Member  : ${if (isPremiumUser) "Yes" else "No"}")
    println("Completed Tasks : $completedTasks")
    println("============================")
}
