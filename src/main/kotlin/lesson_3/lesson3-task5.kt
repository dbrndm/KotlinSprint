package lesson_3

fun main() {
    val firstMove = "D2-D4;0"

    val startingPoint = firstMove[0] + firstMove[1].toString()
    val endPoint = firstMove[3] + firstMove[4].toString()
    val strokeNumber = firstMove[6].toString()

    println(startingPoint)
    println(endPoint)
    println(strokeNumber)
}


