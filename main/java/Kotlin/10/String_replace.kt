package Kotlin

fun main(args: Array<String>)
{
    val adage= "Love begets love."

    println(adage.replace("love", "hete", ignoreCase = true))
    println(adage.replaceFirst("love", "compliment", ignoreCase = true))
    println(adage.replaceRange(5..10, "hello"))
}