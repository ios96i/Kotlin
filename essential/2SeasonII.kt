fun main(){
    println("Enter month from 1 to 12 :")
    val month= readLine()!!.toInt()
    when(month){
        in 3..5 -> println("spring")
        in 6..8-> println("Summer")
        in 9..11-> println("fall")
        12,1,2 -> println("Winter")
        else -> println("is there a new season in your maind")
    }

}