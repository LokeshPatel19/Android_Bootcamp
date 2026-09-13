package Day06

class Person(
    var name: String
) {
    fun changeName(name: String) {
        this.name = name
    }
}

fun main() {
    val person1 = Person("Lokesh")
    println(person1.name)

    person1.changeName("Aditya")
    println(person1.name)
}