data class Person(
    val firstname: String,
    val lastname: String,
)

fun main() {
    val students = arrayOf(
        Person("Pallavi", "Jain"),
        Person("Amit", "Kumar"),
        Person("John", "Doe"),
        Person("Jane", "Doe"),
    )
    students.sortBy { it.firstname }
    for (student in students)
        println(student)
}
