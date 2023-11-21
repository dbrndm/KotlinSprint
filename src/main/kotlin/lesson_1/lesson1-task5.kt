package lesson_1

const val SIZE_TIME = 60

fun main() {
/*
- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
*/

    val secondsFlight = 6480

    val hour = secondsFlight / (SIZE_TIME * SIZE_TIME)
    val hourRemainder = secondsFlight % (SIZE_TIME * SIZE_TIME) // остаток от деления

    val minutes = hourRemainder / SIZE_TIME
    val minutesRemainder = hourRemainder % SIZE_TIME // остаток от деления

    val seconds = minutesRemainder / SIZE_TIME

    val time = String.format("%02d:%02d:%02d", hour, minutes, seconds)
    println("Время, проведенное в космосе: $time")
}