fun main(args:Array<String>){ //args:Array<String> to convert java to kotlin
    print("\n petApp")
    print("\n Enter number of pets: ")
    val MaxSize:Int= readLine()!!.toInt()
    // write app in Array
    var listofPets= Array(MaxSize){""}
     for (i:Int in 0 until MaxSize) {
         print("Enter name Pet $i ")
         listofPets[i]=readLine()!!.toString()


    }
    print("your pet ate using array")
    for(i:Int in 0 until MaxSize){
        println("pet $i : ${listofPets}")
    }
}