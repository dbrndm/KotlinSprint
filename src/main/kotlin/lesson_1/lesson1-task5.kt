package lesson_1

const val sizeTime = 60

fun main() {
/*
- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
*/

    val secondsFlight = 6480

    val hour = secondsFlight / (sizeTime * sizeTime)
    val hourRemainder = secondsFlight % (sizeTime * sizeTime) // остаток от деления

    val minutes = hourRemainder / sizeTime
    val minutesRemainder = hourRemainder % sizeTime // остаток от деления

    val seconds = minutesRemainder / sizeTime

    val time = String.format("%02d:%02d:%02d", hour, minutes, seconds)
    println("Время, проведенное в космосе: $time")
}