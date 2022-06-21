package Kotlin

import kotlin.coroutines.EmptyCoroutineContext.plus

fun main(array: Array<String>){

    val calculator1 = Calculator1()
    println(calculator1.plus(4,5))
    println(calculator1.minus(4,5))
    println(calculator1.multiply(4,5))
    println(calculator1.divide(4,5))

    println()


    val calculator2 = Calculator2()
    println(calculator2.plus(1,2,3,4,5))
    println(calculator2.minus(10,1,2,3))
    println(calculator2.multiply(1,2,3))
    println(calculator2.divide(10,2,3))

    println()

    val calculator3 = Calculator3(3)
    println(calculator3.plus(5).minus(3))


}
class Calculator1(){
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a:Int, b:Int): Int{

        return a - b
    }
    fun multiply(a: Int, b: Int): Int{
        return a*b
    }
    fun divide(a: Int, b: Int): Int{
        return a/b
    }
}

class Calculator2(){
    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }
    fun minus(vararg numbers: Int): Int{
        var result: Int = 0
        for(i in 0 until numbers.size){
            result = result - numbers[i]
        }
        return result
    }
    fun multiply(vararg numbers: Int): Int{
        var result: Int = 1
        numbers.forEach {
            if(it != 0 ){
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int{
        var result: Int = numbers[0]
        numbers.forEachIndexed{index, value ->
            if(index!=0 && value != 0) {
                    result = result / value
            }
        }
        return result
    }
}

class Calculator3(val initialValue: Int){//우리가 만든 클래스는 자료형이 될수 있다.
    fun plus(number: Int): Calculator3{
        val result = this.initialValue + number
        return Calculator3(result)
    }
    fun minus(number: Int): Calculator3{
        val result = this.initialValue - number
        return Calculator3(result)
    }
    fun multiply(number: Int): Calculator3{
        val result = this.initialValue * number
        return Calculator3(result)
    }
    fun divide(number: Int):Calculator3{
        val result = this.initialValue / number
        return Calculator3(result)
    }

}