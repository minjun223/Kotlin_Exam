package Kotlin

fun main(array: Array<String>){
    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

    for(item in a){
        //println(item)
        if(item == 5){
            println("item is Five")
        }else{
            println("item is not Five")
        }
    }
    for((index, item) in a.withIndex()){
        println("index : " + index + "value : " + item)
    }
    a.forEach{
        println(it)
    }
    a.forEach{
        item -> println(item)
    }
    a.forEachIndexed{
        index, item ->    println("index : " + index + "value : " + item)
    }
    println(a.size)
    for (i in 0 until a.size){
        println(a.get(i))
    }
    for (i in 0 until  a.size step(2)) {
        println(a.get(i))
    }

    for(i in a.size - 1 downTo (0)){
        println(a.get(i))
    }
    for(i in a.size -1 downTo (0) step (2)){
        println(a.get(i))
    }
    for(i in 0..a.size){
        println(i)
    }
    var b: Int = 0
    var c: Int = 4

    while(b < c){
        b++
        println("b")
    }
    var d: Int = 0
    do {
        println("hello")
        d++
    }while (d<c)

}