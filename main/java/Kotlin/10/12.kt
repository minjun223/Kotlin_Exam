package Kotlin

fun main(array: Array<String>){
    val night = Night(20, 4)
    val monster = Monster(15, 3)

    night.attack(monster)
//    monster.attack(night)


}

class Night(private var hp: Int, private var power: Int){

    fun attack(monster: Monster){
        monster.defense(power)
    }
    fun defense(dmage: Int){
        hp -= dmage
        if (hp > 0){
            heal()
            println("기사의 현재 채력은 $hp 입니다.")
        }
        else println("기사가 죽었습니다.")
    }
    private fun heal(){
        hp+=3
    }
}

open class Monster(private var hp:Int,private var power: Int) {
    fun attack() {

    }

    fun defense(dmage: Int) {
        hp -= dmage
        if (hp > 0) println("몬스터 현재 채력은 $hp 입니다.")
        else println("몬스터가 죽었습니다.")
    }
}
