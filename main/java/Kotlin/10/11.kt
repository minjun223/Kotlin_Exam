package Kotlin

fun main(array: Array<String>) {
    val testAccess: TestAccess = TestAccess("아무게")
    //private키워드 때문에 외부에서 더 이상 사용할수 없다.
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name = "아무게 투"
//    println(testAccess.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000
}
class Reward(){
    var rewardAmount: Int = 100
}
class TestAcces{
    private var name : String = "홍길동"

    constructor(name: String){
        this.name = name
    }
    fun changeName(newName: String){
        this.name = newName
    }
    private fun test(){
        println("테스트")
    }
}
class TestAccess{
    var name: String = "홍길동"
    constructor(name: String){
        this.name = name
    }
    fun changeNam(newName: String){
        this.name = newName
    }

    private fun test(){
        println("테스트")
    }
}