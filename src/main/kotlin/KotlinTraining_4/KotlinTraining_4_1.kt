package org.example.KotlinTraining_4

fun main() {
    val totalTables = 13
    val bookedToday = totalTables
    val bookedTomorrow = 9

    val availableToday = bookedToday < totalTables
    val availableTomorrow = bookedTomorrow < totalTables

    println("Доступность столиков на сегодня: $availableToday, Доступность столиков на завтра: $availableTomorrow")
}