package Kotlin

fun main(array: Array<String>){
    //first()
    println(second(90))
    println(three(89))
    gugudan()
}

fun first(){
    val list1 = MutableList(9, { 0 })//<>사용필요x
    val list2 = MutableList(9, { true })

    for (i in 0..8){
        list1[i] = i+1
    }
    println(list1)
    //foreach에서 -> 후에 if를 넣어도 된다.
    list1.forEachIndexed{ index, value ->
        if (value % 2 == 0){
            list2[index] = true
        }else{
            list2[index] = false
        }
    }
    println(list2)
}

fun second(score: Int): String{
//    when (score){
//        in 90..100 ->{
//            return "A"
//        }
//        in 80..89 ->{
//            return "B"
//        }
//        in 70..79 ->{
//            return "C"
//        }
//        else -> {
//            return "F"
//        }
//    }
    var result: String = "F"
    when(score){
        in 90..100 ->{
            result = "A"
        }
        in 80..89 ->{
            result = "B"
        }
        in 70..79 ->{
            result = "C"
        }
    }
    return result
    println(result)
}

fun three(number: Int): Int{
    val a: Int = number / 10
    val b : Int = number % 10
    return a + b

}
fun gugudan(){
    for(x in 1..9){
        for (y in 1..9){

            println("$x x $y = ${x*y}")
        }
    }
}
