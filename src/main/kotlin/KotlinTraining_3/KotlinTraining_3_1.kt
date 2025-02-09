package org.example.KotlinTraining_3

fun main() {
    val userName = "Артур"
    var greeting: String

    val hour = 10


    if (hour < 18) {
        greeting = "Доброе утро, $userName!"
    } else {
        greeting = "Добрый вечер, $userName!"
    }


    println(greeting)
}