package lesson_1

fun main() {
/*
- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
*/

    val secondsFlight = 6480

    val hour = secondsFlight/3600
    val hourRemainder = secondsFlight%3600 // остаток от деления

    val minutes = hourRemainder/60
    val minutesRemainder = hourRemainder%60 // остаток от деления

    val seconds = minutesRemainder/60

    println("Время, проведенное в космосе: 0$hour:$minutes:0$seconds")
}