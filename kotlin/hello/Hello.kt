open class Animal()
open class Mammal() : Animal()

class Person1(
    val firstname: String,
    val lastname: String,
)

data class Person2(
    val firstname: String,
    val lastname: String,
)

fun main() {
    println("Hello, world!")
    val p1 = Person2("John", "Doe")
    val p2 = Person2("Pallavi", "Jain")
    val p3 = Person2("Pallavi", "Jain")
    val p4 = p3
    println(p1)
    println(p2)
    println(p1 === p2) // Identity, false
    println(p2 === p3) // Identity, false
    println(p3 === p4) // Identity, true
    println(p1 == p2) // Equality, false, println(Objects.equal(p1, p2))
    println(p2 == p3) // Equality, true, println(Objects.equal(p2, p3))
    println(p3 == p4) // Equality, true, println(Objects.equal(p2, p3))
}
