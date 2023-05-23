var hello = { println("Hello, world!") }
fun hello() {
    println("The other hello")
}

fun main() {
    println(hello)
    println(hello())

    var otherFun = hello
    otherFun()
}
