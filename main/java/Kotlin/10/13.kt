package Kotlin

import android.speech.tts.TextToSpeech


fun main(args: Array<String>){
    val superCar100: SuperCar100 = SuperCar100()
    superCar100.drive()
    superCar100.stop()

    val bus100: Bus100 = Bus100()
    bus100.drive()
}

open class Car100(){
    open fun drive(): String{
        return "달린다."
    }
    fun stop(){

    }
}
class SuperCar100() : Car100(){
    override fun drive(): String{
        val run = super.drive()
        return "빨리 $run"
    }

}
class Bus100() : Car100(){
    override fun drive(): String{
        return super.drive()
    }
}