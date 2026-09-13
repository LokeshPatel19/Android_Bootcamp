package Day06

class Rectangle(
    var width: Double,
    var length: Double
) {
    fun calculateArea() : Double {
        return width * length
    }
}

fun main() {
    val rectangle = Rectangle(45.7, 90.9)
    print(rectangle.calculateArea())
}