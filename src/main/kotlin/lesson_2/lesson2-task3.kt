package lesson_2

fun main() {
    val h1 = 9
    val m1 = 39
    val timeFirst = h1 * 60 + m1

    val timeSecond = 457

    val time = timeFirst + timeSecond
    val hour = time / 60
    val minutes = time % 60

    println("$hour:$minutes")
}