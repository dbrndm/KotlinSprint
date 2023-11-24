package lesson_4

const val MINIMUM_WEIGHT = 35
const val MAXIMUM_WEIGHT = 100
const val VOLUME = 100

fun main() {

    val cargoWeightFirst = 20
    val cargoVolumeFirst = 50

    val cargoFirst = (cargoWeightFirst in MINIMUM_WEIGHT..MAXIMUM_WEIGHT) && (cargoVolumeFirst < VOLUME)

    println("Груз с весом $cargoWeightFirst кг и объемом $cargoVolumeFirst л соответствует категории 'Average': $cargoFirst")


    val cargoWeightSecond = 50
    val cargoVolumeSecond = 100

    val cargoSecond = (cargoWeightSecond in MINIMUM_WEIGHT..MAXIMUM_WEIGHT) && (cargoVolumeSecond < VOLUME)

    println("Груз с весом $cargoWeightSecond кг и объемом $cargoVolumeSecond л соответствует категории 'Average': $cargoSecond")

}