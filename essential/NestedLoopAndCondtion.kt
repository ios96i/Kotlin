fun main(){
    for(userID in 1..2){
        println("enter your name:")
        val name= readLine()!!.toString()
        println("where you live:")
        val PlaceLive= readLine()!!.toString()
        var PetName:String?=""     // "" empty space
        println("enter no of pets :")
        val petCount:Int = readLine()!!.toInt()
        for(petID in 1..petCount){
            print("Enter petID ")
            PetName= PetName + readLine()!!.toString() + ","
        }
        println("==user info==")
        println("name : $name ")
        println("live in $PlaceLive")
        println("pet name $PetName")
        if(PetName!!.contains("cat")){
            print("we had program for u")
        }
    }
}