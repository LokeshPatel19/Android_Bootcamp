package day02

fun playGuessingGame(secretNumber: Int = 7, maxAttempts: Int = 3) {
    println("Guess the secret number! You have $maxAttempts attempts.")

    for (attempt in 1..maxAttempts) {
        print("\nAttempt $attempt of $maxAttempts - Enter your guess: ")
        val guess = readln().toIntOrNull()

        if (guess == null) {
            println("Invalid input! Please enter a whole number.")
            continue
        }

        when {
            guess == secretNumber -> {
                println("Correct! You guessed it in $attempt attempt(s).")
                return
            }
            guess > secretNumber -> println("Too high!")
            else -> println("Too low!")
        }
    }

    println("\nOut of attempts! The secret number was $secretNumber.")
}

fun main() {
    playGuessingGame()
}
