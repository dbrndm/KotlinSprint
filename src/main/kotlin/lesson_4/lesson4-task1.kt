package lesson_4

const val NUMBER_OF_TABLE = 13

fun main() {

    var reservationForToday = 13
    var tableAvailabilityToday = reservationForToday < NUMBER_OF_TABLE

    var reservationForTomorrow= 0
    var tableAvailabilityTomorrow = reservationForTomorrow < NUMBER_OF_TABLE

    println("Доступность столиков на сегодня: $tableAvailabilityToday")
    println("Доступность столиков на завтра: $tableAvailabilityTomorrow")

}