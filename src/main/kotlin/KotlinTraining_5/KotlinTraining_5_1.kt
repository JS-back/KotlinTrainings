package org.example.KotlinTraining_5

fun main() {

    val firstNumber: Int = (1..10).random()
    val secondNumber: Int = (1..10).random()

    println("Сложите следующие числа: $firstNumber + $secondNumber")


    val userInput: String? = readLine()
    val userAnswer: Int = userInput?.toIntOrNull() ?: 0

    if (userAnswer == firstNumber + secondNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}