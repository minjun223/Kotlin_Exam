package Kotlin

//목절 타입체크- 제너릭

fun main(args: Array<String>){
    val list1 = listOf(1,2,3,"가")
    val b : String = list1[2].toString()

    val list2 = listOf<String>("a","b","c")
    val c: String = list2[2]

    val list3 = listOf(1,2,3,4,"가","나", 3.0)
   // val list4 = listOf<Int>(1,2,3,"가")

    val list5 = listOf(1,2,3,"가")

}