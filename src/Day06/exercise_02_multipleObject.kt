package Day06

class Car(
    var brand : String,
    var model: String,
    var year: Int
) {
    fun display() {
        println("Brand: $brand\nModel: $model\nYear: $year")
    }
}

fun main() {
    val car1 = Car("Celerio", "zxi", 2026)
    val car2 = Car("swift", "yxi", 2024)
    val car3 = Car("Baleno", "230-d", 2025)
    car1.display()
    car2.display()
    car3.display()
}