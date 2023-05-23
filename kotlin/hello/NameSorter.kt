fun compareByLength(s1: String, s2: String) = s1.length - s2.length

fun main() {
    val names = arrayOf("Kumar", "Nikude", "Jain", "Bastade", "Koot")

    names.sortWith(::compareByLength)
    names.sortWith { s1, s2 -> s1.length - s2.length }
    names.sortBy { it.length }
    for (name in names)
        println(name)
}
