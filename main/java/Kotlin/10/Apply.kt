package Kotlin

class Person
{
    var name:String=""
    var age:Int = 0
    var money:Int = 0

    fun toSting() = "$name $age $money"
}
fun main(args: Array<String>)
{
    println(
        Person().also {person:Person ->
            person.name = "Alan"
            person.money= 70
        }
    )
}