import java.util.*

fun main(){
    print("Enter your birthday :")
    val YOB= readLine()!!.toInt()
    val CurrentYear= Calendar.getInstance().get(Calendar.YEAR)                     //val CurrentYear=2020
    val Age= CurrentYear-YOB
    println("your age $Age years old")

}