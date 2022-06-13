package Kotlin

var number100: Int =10

fun main(args: Array<String>){
    println(number100)
    val test = Test("홍길동")
    test.testFun()
    test.name//지역변수
    println(number100)
}
class Test(var name: String){
    fun testFun(){
        var birth: String = "2000/3/1"
        name = "홍길동"
        number100 = 100
        fun testFun2(){
            var gender : String = "male"

        }
    }
    fun testFun2(){

    }
}