package lesson_2

fun main() {
    val numberOfStaff = 50
    val staffSalary = 30000

    val numberOfInterns = 30
    val internSalary = 20000

    val payrollOfAllEmployees = numberOfStaff * staffSalary
    val totalPayroll = numberOfInterns * internSalary + payrollOfAllEmployees

    val averagePayroll = totalPayroll / (numberOfStaff + numberOfInterns)

    println(payrollOfAllEmployees)
    println(totalPayroll)
    println(averagePayroll)

}