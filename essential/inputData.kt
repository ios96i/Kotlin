fun main(){
    print("Enter name:")
    val name:String= readLine()!!.toString()    //!!: to be sure its not Null
    print("enter Age:")
    val age:Int= readLine()!!.toInt()     //readLine to make user input info
    print("enter GPA:")
    val GPA:Double= readLine()!!.toDouble()

    println("===user info===")
    println("Your name : $name")
    println("your age :"+age)
    println("your GPA : $GPA")



}