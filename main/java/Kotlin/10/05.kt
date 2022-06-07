package Kotlin

fun main(array: Array<String>){
    val array = arrayOf<Int>(1,2,3)

    val number = array.get(0)
    println(number)
    //val number1 = array.get(100)
    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    array.set(100, 100)

    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('b', 'c')
    val a3 = doubleArrayOf(1.2,123.56)

    var a5 = Array(10,{0})//lamda 활용
    var a6 = Array(5, {1;2;3;})
}