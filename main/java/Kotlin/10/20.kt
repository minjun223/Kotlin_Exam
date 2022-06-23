package Kotlin


fun main(array: Array<String>){
    val tv = TV(listOf<String>("K", "M", "S"))

    tv.channelUp()
   // println(tv.checkCurrentChannel())
    tv.channelDown()
   // println(tv.checkCurrentChannel())
    tv.currentChannelNumber
}
class TV(val channels: List<String>){
    var onOroff :Boolean = false
    var currentChannelNumber = 0
        set(value){//set쓸때는 field꼭 넣기
            field = value
            //currentChannelNumber = value 절대안됨 무한반복이 되어버린다.
            if(field > 2){
                field = 2
            }
            println(value)
        }
        get(){
            println("호출되었습니다.")
            return field + 1
        }
    //값의 할당
    //a = b
    fun switch(){
        onOroff = !onOroff
    }
    fun checkCurrentChannel(): String{
        return channels[currentChannelNumber]
    }
    fun channelUp(){
        currentChannelNumber = currentChannelNumber +1
//        channels.forEachIndexed{ index, value ->
//            if(currentChannelNumber == index){
//                currentChannelNumber = currentChannelNumber + 1
//                return
//            }
//        }
    }

    fun channelDown(){
        currentChannelNumber = currentChannelNumber -1
//        channels.forEachIndexed{ index, value ->
//            if(currentChannelNumber == index){
//                currentChannelNumber = currentChannelNumber +1
//                return
//            }
//        }
    }
}