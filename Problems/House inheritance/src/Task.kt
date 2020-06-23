import kotlin.math.roundToInt

fun main() {
    val rooms = readLine()!!.toInt()
    val price = readLine()!!.toInt()
    val house = House(rooms, price)
    println(totalPrice(house))
}

class House(val rooms: Int, val price: Int)

fun totalPrice(a:House): Int{
    var answer = 0
    var price = a.price
    if(a.price <= 0){
        price = 0
    }
    when(a.rooms){
        in Int.MIN_VALUE..1 -> answer = price * 1
        in 2..3 -> answer = (price * 1.2).roundToInt()
        4-> answer = (price*1.25).roundToInt()
        in 5..7 -> answer = (price * 1.4).roundToInt()
        in 8..Int.MAX_VALUE-> answer = (price*1.6).roundToInt()
    }
    return answer
}