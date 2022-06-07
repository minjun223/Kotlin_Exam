package Kotlin

//-그룹 모음집이 필요할때
//Index란 0부터 시작해서 순서대로
fun main(array: Array<String>){
    var number :Int = 10
    var group1 = arrayOf<Int>(1,2,3,4,5)

    println(group1 is Array)


    var number1 = 10
    var group2 = arrayOf(1,2,3.5,"hello")
    val test1 = group1.get(0)
    val test2 = group2.get(4)
    println(test1)
    println(test2)

    //배열의 값을 꺼내는 방법(2)
    val test3 = group1[0]
    println(test3)
    //배열의 값을 바꾸는 방법(1)
    group1.set(0,100)
    println(group1[0])

}