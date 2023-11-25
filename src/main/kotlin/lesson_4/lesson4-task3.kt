package lesson_4

const val WEATHER_IS_SUNNY = true
const val AWNING_IS_OPEN = true
const val HUMIDITY = 20
const val TIME_OF_YEAR = "winter"


fun main() {
    val weatherTodayIsSunny = true
    val awningIsCurrentlyOpen = true
    val humidity = 20
    val currentTimeOfYear = "winter"

    val conditionsForSuccessfulGrowth = (weatherTodayIsSunny == WEATHER_IS_SUNNY) &&
            (awningIsCurrentlyOpen == AWNING_IS_OPEN) &&
            (humidity == HUMIDITY) &&
            (currentTimeOfYear != TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsForSuccessfulGrowth")
}