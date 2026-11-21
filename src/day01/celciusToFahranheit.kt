package day01

fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9.0 / 5.0) + 32.0
}

fun main() {
    println("Enter the temp in celsius :")
    val celsius = readln().toDouble()
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius°C is equal to $fahrenheit°F") // Output: 25.0°C is equal to 77.0°F
}
