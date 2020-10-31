    fun main(){
        print("pick up food menu :")
        val FoodId= readLine()!!.toInt()

        when (FoodId){
            in 1..4-> {
                print("sandwich")
                print("\n salt")
            }
            in 5..9-> print("you got burgger")

            else -> print("you didnt order anything")
        }
    }