open class Super
open class Sub : Super()

fun Super.something() = println("Super.something")
fun Sub.something() = println("Sub.something")

fun main() {
    val superVal = Super()
    val subVal = Sub()
    val subAsSuperVal: Super = Sub()

    superVal.something()
    subVal.something()
    subAsSuperVal.something()
}
