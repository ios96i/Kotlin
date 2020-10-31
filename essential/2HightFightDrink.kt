
fun main(){
    println("enter your hight: ")
    var HightPerson1= readLine()!!.toDouble()
    println("enter his hight: ")
    var HightPerson2= readLine()!!.toDouble()

    println("Recommanded way:")
    if(HightPerson1 > HightPerson2){
        println("use your hand")
    }else if(HightPerson1 == HightPerson2){
        println("kick his ass")
    }else{
        println("Use wepon")
    }

}



