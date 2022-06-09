package Kotlin

fun main(array: Array<String>){

    //immnutable collections 변경불가능
    val numberList = listOf<Int>(1,2,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    //중복을 허용하지 않는다.
    //순서가 없다.
    val numberSet = setOf<Int>(1,2,3,3)
    println(numberSet)
    numberList.forEach{
        println(it)
    }

    //map - key ,value방식
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))
    //Mutable collection 변경가능.
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,5)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4)
    mNumberSet.add(10)
    println(numberSet)


}