package lesson_2

const val timeSize = 60

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val timeDeparture = hourOfDeparture * timeSize + minuteOfDeparture

    val travelTime = 457

    val timeArrival = timeDeparture + travelTime
    val hourOfArrival = timeArrival / timeSize
    val minuteOfArrival = timeArrival % timeSize

    println("$hourOfArrival:$minuteOfArrival")
}