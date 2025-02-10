package org.example.KotlinTraining_2

fun main() {
    val scores = listOf(3, 4, 3, 5)
    val averageScore = scores.average()
    println("Средний балл: $averageScore")

    fun calculateAverage(scores: List<Int>): Double {
        val total = scores.sum()
        return total.toDouble() / scores.size
    }