package Kotlin


fun main(args: Array<String>)
{
    //엘비스 연산자
//    val number:Int? = null
//    println(number ?:0)

//    val number2:Int? = 15
//    println(number2?:0)
    val number: Int? = null
    val number2 = 1225

    checkNull(number)
    checkNull(number2)
}
fun checkNull(any: Any?){
    if(any==null){
        println("null이 들어왔습니다.")
        return
    }
    println(any.toString())
}

