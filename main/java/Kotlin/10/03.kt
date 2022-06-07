package Kotlin

 fun main(array: Array<String>){
//     val a: Int = 5
//     val b: Int = 10
//
//     if(a>b){
//         println("a가 b보다 크다.")
//     }else println("a가 b보다 작다.")

//     val number: Int? = 100
//     val number2= number ?: 10
//     println()
//     println(number2)
//     val num1: Int=10
//     val num2: Int=20

//     val value: Int = 3
//     when(value){
//         1 ->
//             println("value is 1")
//
//         2 ->
//             println("value is 2")
//
//         3 ->
//             println("value is 3")
//         else -> println("I do not know value")
//     }
//     val value2 = when(value){
//         1->10
//         2->20
//         3->30
//         else -> 100
//     }
//     println(value2)

     val value: Int? = null
     val value2: Boolean? = null
    when(value){
      null-> println("value is null")
      else-> println("value is not null")
    }

    val value3 = when(value2){
       true -> 1
        false->3
        else->4
    }
     val value4: Int = 10
     when(value4){
         is Int-> println("value4 is Int")
         else -> println("value4 is not Int")
     }

     val value5: Int = 87
     when(value5){
         in 80..90 ->println("value is in 80 - 90")
     }
 }

