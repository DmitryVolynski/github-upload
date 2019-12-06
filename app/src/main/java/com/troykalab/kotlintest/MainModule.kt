package com.troykalab.kotlintest

import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    print(numbers.divisibleBy {
        it.rem(3)
    })
/*
    println(getFortuneCookie())
    getTestValue()
    //dayOfWeek()

    val rollDice = { n : Int -> if (n > 0) Random.nextInt(n) + 1 else 0}
    val rollDice2 : (Int) -> Int = { n -> if (n > 0) Random.nextInt(n) + 1 else 0}
    val y = rollDice(5)
    println(y)
*/
}

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when (day) {
        0 -> print("Sunday")
        1 -> print("Monday")
        2 -> print("Tuesday")
        3 -> print("Wednesday")
        4 -> print("Thursday")
        5 -> print("Friday")
        6 -> print("Saturday")
    }
}

fun getFortuneCookie() : String {
    val cookies = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    println(cookies.filter { it.startsWith("T") })
    return cookies[Random.nextInt(cookies.size)]
}

fun getTestValue() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices.filter { it.startsWith("c") }.filter { it.endsWith("e") })
    println(spices.filter { it.startsWith("c") && it.endsWith("e") })
    println(spices.take(3).filter { it.startsWith("c") }.take(1))
    println(spices.sortedBy { it.length })
}

fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    return this.filter { block(it) == 0 }
}