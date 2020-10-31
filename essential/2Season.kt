fun main(){
    print("enter season 1-4 :")
    val season = readLine()!!.toInt()
    when(season){
        1-> println("spring")
        2-> println("summer")
        3->{
            println("fall")
            println("autumn")
        }
        4-> println("winter")
        else -> print("there are another season on the moon")
    }
}