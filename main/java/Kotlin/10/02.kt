package Kotlin

fun plusThree(first: Int, second: Int, third: Int): Int{
    return  first + second + third
}

fun minusThree(first: Int, second: Int, third: Int)= first - second - third

fun mutiplyThree(first: Int=1, second: Int=1, third: Int=1,):Int{
    return first * second* third
}
fun showMyPlus(first: Int, second: Int): Int{
    println(first)
    println(second)
     fun plus(first: Int, second: Int): Int{
         return first + second
     }
    return plus(first, second)
}
fun main(array: Array<String>){
    val result = plusThree(1, 2, 3)
    println(result)
    val result2 = plusThree(10, 1, 2)
    println(result2)
    val result3 = plusThree(2, 2, 2)
    println(result3)
    val result4 = mutiplyThree()
    println(result4)
    val result5 = showMyPlus(4,5)
    println(result5)
}
