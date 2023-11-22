package lesson_2

import java.text.DecimalFormat
import kotlin.math.pow

const val month = 12

fun main() {
    val initialAmount = 70_000
    val interestRate = 16.7
    val depositTerm = 20

    val compoundInterest = initialAmount * (1 + interestRate / (month * 100)).pow(month * depositTerm)

    val df = DecimalFormat("#.###")
    val compoundInterestOut = df.format(compoundInterest)

    println(compoundInterestOut) // !! Ответ отличается от значения, указанного в задании !!
}