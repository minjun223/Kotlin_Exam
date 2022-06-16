package Kotlin

//절차지향 프로그래밍 문제 해결-코드를 위에서부터 아래로 실행하면 해결
//객체지향 프로그램밍 문제 해결-객체를 만들어서, 객체에게 일을 시켜서 문제를 해결

fun main(array: Array<String>) {

    Car("v8 engine", "big")
    val bigCar = Car("v8 engine", "big")
    val bigCar1 : Car = Car("v8 engine", "big")
    val superCar1: SuperCar1 = SuperCar1("good engine", "big", "white")

    val runableCar: RunableCar = RunableCar("simple engine", "body")
    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()

    val runableCar2 : RunableCar = RunableCar("nice engine", "long body")


    println()
    val testCless = TestCless()
    testCless.test(1)
}
class Car(var engine: String,var  body: String){

}
class SuperCar1{
    var engine : String
    var body: String
    var door : String
    constructor(engine: String, body: String, door: String){
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.body = body
        this.door = door
    }
}
class Car1(engine: String, body: String){
    var door : String = ""


    constructor(engine: String, body: String, door: String): this(engine, body){
            this.door = door
    }
}
class Car2{
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }
    constructor(engine: String, body: String, door: String){
        this.engine = engine
        this.door = door
        this.body = body
    }
}
class RunableCar(engine: String, body: String){
    fun ride(){
        println("탑승 하였습니다.")
    }
    fun drive(){
        println("달립니다!")
    }
    //$가 인트형 출력
    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }

    //인스턴스 멤버 변수에 접근 방법


}
class RunableCar2{
    var engine: String
    var body: String

    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }
    init{
        println("RunableCar2가 만들어 졌습니다.")
    }
    fun ride(){
        println("탑승 하였습니다.")
    }
    fun drive(){
        println("달립니다!")
    }
    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}
class TestCless(){

    fun test(a: Int){
        println("up")
    }
    fun test(a: Int, b: Int){
        println("down")
    }

}