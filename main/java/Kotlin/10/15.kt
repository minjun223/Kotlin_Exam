package Kotlin

fun main(array: Array<String>){

    val monster = SuperMonster(100, 10)
    val night  = SuperNight(130, 8)
    monster.attack(night)
}
//상속이 만들어낸 특징
open class Charator(var hp: Int, val power: Int){
    fun attack(charator: Charator, power: Int = this.power){
        charator.defense(power)
    }

    open fun defense(dmage: Int){
        hp -= dmage
        if(hp > 0) println("${javaClass.simpleName}의 남은 체력 $hp")
        else println("사망 했습니다.")
    }
}
class SuperMonster(hp:Int,  power: Int) : Charator(hp, power) {

    fun bite(charator: Charator){
        super.attack(charator, power+2)
    }
}
class SuperNight(hp:Int,  power: Int) : Charator(hp, power) {
    val defensePower =2
    override fun defense(dmage: Int){
        super.defense(dmage - defensePower)
    }
}