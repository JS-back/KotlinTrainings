package org.example.KotlinTraining_2

fun main() {
    val numberOfStudents: Int = 4
    val score1: Int = 3
    val score2: Int = 4
    val score3: Int = 3
    val score4: Int = 5
    val totalScore: Int = score1 + score2 + score3 + score4 // Сумма всех баллов
    val averageScore: Double = totalScore.toDouble() / numberOfStudents // Средний балл

    println("Общее количество учеников: $numberOfStudents")
    println("Сумма баллов: $totalScore")
    println("Средний балл: $averageScore")
}
