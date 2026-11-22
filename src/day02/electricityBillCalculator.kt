package day02

fun calculateElectricityBill(units: Int): Double {
    if (units <= 0) return 0.0

    return when {
        units <= 100 -> units * 2.0
        units <= 200 -> (100 * 2.0) + ((units - 100) * 3.0)
        else -> (100 * 2.0) + (100 * 3.0) + ((units - 200) * 5.0)
    }
}

fun main() {
    println("Enter units consumed: ")
    val units = readln().toIntOrNull() ?: 0

    if (units < 0) {
        print("Please enter a valid positive number of units.")
    } else {
        val totalBill = calculateElectricityBill(units)
        print("Total Electricity Bill for $units units: ₹$totalBill")
    }
}
