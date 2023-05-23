import java.util.Random
import java.util.Scanner


const val MAX = 3
fun main() {
    val s = Scanner(System.`in`)
    val number = Random().nextInt(MAX) + 1
    println("Guess my number (it is between 1 and $MAX)")
    while (true) {
        val guess = s.nextInt()
        println(if (guess == number)
            "You guessed correctly!" else
            "Haha, wrong!")
    }
}
