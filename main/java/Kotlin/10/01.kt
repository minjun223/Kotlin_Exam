package Kotlin

//var num=10
//var 변환 가능
//val 한번값은 절대로 안바뀜
//var에서 var=10에서 20.5로 바꾸는건 안됨 처음 int에서 float으론 못 바꿈
//var number: Int =20
//var hello: String = "Hello"
//var point: Double = 3.4
//var 연산의 결과값을 변수에 넣어 줄수 있다.
//var b = "1"
//var c = b.toInt()
//var d = b.toFloat()
//var e = "john"
//var f = "My name is $e Nice to meet you"
//Null은 존재 하지 않는다.
//?를 쓰면 ?를 받을수 있다.
//var ac: Int? = null

fun main(args:Array<String>){
  //  println(num)
//    println(number)
//    println(hello)
//    println(point)
//        println(b)
//    println(c)
//    println(d)
//    println(f)
//    println(ac)

    val result = plus(5,10)
    println(result)
    val result2 = plus(first = 20, second = 30)
    println(result2)

    val result4 = plusFive(10, 20)
    println(result4)
    println()
    plusFive(10, 50)
    println()
    val result6 = plusShort(50, 50)
    println(result6)
    plusMany(1,2,3)
    plusMany(100)
}
fun plusFive(first: Int, second: Int =5): Int{
    val result : Int = first + second
    return result
}
fun printPlus(first: Int, second: Int): Unit{
    val result: Int = first + second
    println(result)
}
fun plusMany(vararg  numbers: Int){
    for (number in numbers){
        println(number)
    }
}
fun plusShort(first: Int, second: Int) = first + second
fun plus(first: Int, second: Int): Int{
    println(first)
    println(second)
    val result : Int = first + second
    println(result)
    return result
}

