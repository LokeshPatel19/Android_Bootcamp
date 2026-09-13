package Day06

class Book(
    var title : String,
    var author: String,
    var price: Double
) {
    fun display() {
        println("Title: $title\nAuthor: $author\nPrice: $price")
    }
}

fun main() {
    val book = Book("Atomic Habbit", "maxwell", 349.0)
    book.display()
}